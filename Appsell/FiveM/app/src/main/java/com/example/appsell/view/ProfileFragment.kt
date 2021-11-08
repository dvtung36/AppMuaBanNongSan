package com.example.appsell.view

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.util.Util
import com.example.appsell.R
import com.example.appsell.base.Until
import com.example.appsell.model.Profile
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.tapadoo.alerter.Alerter
import kotlinx.android.synthetic.main.fragment_profile.*
import android.content.Context.MODE_PRIVATE

import android.content.SharedPreferences
import android.net.Uri
import android.webkit.MimeTypeMap
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.UploadTask
import kotlinx.android.synthetic.main.fragment_new_product.*
import kotlinx.android.synthetic.main.fragment_profile.btn_back
import kotlinx.android.synthetic.main.fragment_profile.txt_create
import kotlin.math.log

class ProfileFragment : Fragment() {

    var isManager: Boolean = false

    var storage: FirebaseStorage? = null
    var storageReference: StorageReference? = null
    private var startForResult: ActivityResultLauncher<String>? = null
    lateinit var uri: Uri
    private var path: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val callBack: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                parentFragment?.findNavController()?.popBackStack()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callBack)

        startForResult = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
            uri?.let {
                this.uri = it
                uploadImage()
            }
        }

        storage = FirebaseStorage.getInstance()
        storageReference = storage!!.reference
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getProfile()

        btn_back.setOnClickListener {
            findNavController().popBackStack()
        }

        txt_create.setOnClickListener {
            updateProfile()
        }
        imageAvatar.setOnClickListener{chooseImage()}
    }

    private fun updateProfile() {
        val fullName = edt_full_name.text.toString().trim()
        val date = edt_date.text.toString().trim()
        val address = edt_address.text.toString().trim()
        val phone = edt_phone.text.toString().trim()
        val email: String = arguments?.getString(LoginFragment.EMAIL)!!
        val profile = Profile(fullName, date, address, isManager, phone, path)

        val database: FirebaseDatabase = FirebaseDatabase.getInstance()
        val reference: DatabaseReference = database.reference

        reference.child("username").child(email.replace(".", "")).setValue(profile)
            .addOnSuccessListener {
                findNavController().popBackStack()
                Until.message("Cập nhật thông tin thành công", requireActivity())
            }
            .addOnFailureListener {
                Until.message(it.message ?: "Lỗi hệ thống vui lòng thử lại", requireActivity())
            }
    }

    private fun getProfile() {
        val email: String = arguments?.getString(LoginFragment.EMAIL)!!
        val allPost = Firebase.database.reference.child("username").child(email.replace(".", ""))

        Until.showLoading(requireActivity())
        allPost.addListenerForSingleValueEvent(object : ValueEventListener {
            @SuppressLint("CommitPrefEdits")
            override fun onDataChange(snapshot: DataSnapshot) {
                val profile: Profile? = snapshot.getValue(Profile::class.java)
                edt_full_name.setText(profile?.userName)
                edt_date.setText(profile?.date)
                edt_address.setText(profile?.address)
                edt_phone.setText(profile?.phone)
                path = profile?.avatarURL.toString()
                Glide.with(requireActivity())
                    .load(path)
                    .apply(RequestOptions())
                    .fitCenter()
                    .into(imageAvatar)
                isManager = profile?.isManager!!
                Until.hideLoading()
            }

            override fun onCancelled(error: DatabaseError) {
                Until.hideLoading()
            }
        })
    }

    private fun uploadImage() {
        Until.showLoading(requireActivity())
        val uploadTask: UploadTask
        val storageReference: StorageReference =
            FirebaseStorage.getInstance().getReference("profile_manager")

        val local: StorageReference =
            storageReference.child("" + System.currentTimeMillis() + "." + getFile(uri))

        uploadTask = local.putFile(uri)
        uploadTask.continueWithTask { p0 ->
            if (!p0.isSuccessful) {
                Until.message(
                    p0.exception?.message ?: "System error please try again",
                    requireActivity()
                )
            }
            Until.hideLoading()
            local.downloadUrl
        }.addOnCompleteListener { value ->
            if (value.isSuccessful) {
                try {
                    path = value.result.toString()
                    Glide.with(requireActivity())
                        .load(value.result)
                        .apply(RequestOptions())
                        .fitCenter()
                        .into(imageAvatar)
                } catch (e: Exception) {
                    Until.message(e.message ?: "System error please try again", requireActivity())
                }
                Until.hideLoading()
            }
        }
    }

    private fun getFile(uri: Uri): String {
        val contentResolver: ContentResolver = requireActivity().contentResolver
        val mimeTypeMap: MimeTypeMap = MimeTypeMap.getSingleton()
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri))!!
    }

    private fun chooseImage() {
        startForResult?.launch("image/*")
    }

}