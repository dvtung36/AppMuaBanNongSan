package com.example.appsell.view

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.appsell.R
import com.example.appsell.base.Constant
import com.example.appsell.base.Until
import com.example.appsell.model.BankModel
import com.example.appsell.model.Order
import com.example.appsell.model.Profile
import com.example.appsell.model.Purchase
import com.example.appsell.viewmodel.MainViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_cart.btn_back
import kotlinx.android.synthetic.main.fragment_cart.txtPayment
import kotlinx.android.synthetic.main.fragment_input_card.*
import java.util.*
import kotlin.collections.ArrayList
import android.widget.ArrayAdapter
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.fragment_new_product.*
import java.text.SimpleDateFormat

class InputCardFragment : Fragment() {

    lateinit var viewModel: MainViewModel
    var profile: Profile = Profile()
    var totalCost = 0
    var isOnline = true
    var bankList = ArrayList<BankModel>()
    var typePayment = Constant.TYPE_CART

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val callBack: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                parentFragment?.findNavController()?.popBackStack(R.id.cartFragment, false)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callBack)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        getProfile()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_input_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        totalCost()
        setBankList()

        btn_back.setOnClickListener {
            findNavController().popBackStack()
        }

        txtPayment.setOnClickListener {
            payment(viewModel.listProduct)
        }

        buttonOnline.setOnClickListener {
            setButtonBackground()
        }
        buttonOffline.setOnClickListener {
            setButtonBackground()
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun setButtonBackground() {
        isOnline = !isOnline
        if (isOnline) {
            buttonOnline.setBackgroundResource(R.drawable.bg_button_online_select)
            buttonOnline.setTextColor(requireContext().getColor(R.color.white))
            buttonOffline.setBackgroundResource(R.drawable.bg_button_off_un_select)
            buttonOffline.setTextColor(requireContext().getColor(R.color.colorPrimary))
            layoutInfo.visibility = View.VISIBLE
            typePayment = Constant.TYPE_CART
        } else {
            buttonOnline.setBackgroundResource(R.drawable.bg_button_on_un_select)
            buttonOnline.setTextColor(requireContext().getColor(R.color.colorPrimary))
            buttonOffline.setBackgroundResource(R.drawable.bg_button_offline_select)
            buttonOffline.setTextColor(requireContext().getColor(R.color.white))
            layoutInfo.visibility = View.GONE
            typePayment = Constant.TYPE_RECEIPT
        }
    }

    @SuppressLint("SetTextI18n")
    private fun totalCost() {
        totalCost = 0
        viewModel.listProduct.forEach {
            totalCost += it.count * it.product?.cost?.toInt()!!
        }

        textViewTotal.text = Until.formatNumber(totalCost.toLong()) + " VND"
    }

    private fun payment(orders: ArrayList<Order>) {
        val calendar = Calendar.getInstance()
        val time: Long = calendar.time.time
        val purchase = Purchase(time, profile, orders, Constant.ODER, typePayment, tvBank.text.toString(), tvNumber.text.toString(), tvContent.text.toString())

        Until.showLoading(requireActivity())
        FirebaseDatabase.getInstance().reference.child("purchase").child("" + time)
            .setValue(purchase)
            .addOnSuccessListener {
                Until.message(
                    requireContext().getString(R.string.payment_message),
                    requireActivity()
                )
                findNavController().popBackStack(R.id.homeFragment, false)
                viewModel.listProduct.clear()
                Until.hideLoading()
            }
            .addOnFailureListener {
                Until.message(it.message ?: "Lỗi hệ thống vui lòng thử lại", requireActivity())
                Until.hideLoading()
            }
    }

    private fun getProfile() {
        val email: String = arguments?.getString(EMAIL)!!
        val allPost = Firebase.database.reference.child("username").child(email.replace(".", ""))

        allPost.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                profile = snapshot.getValue(Profile::class.java)!!
                Until.hideLoading()
            }

            override fun onCancelled(error: DatabaseError) {
                Until.hideLoading()
            }
        })
    }

    private fun setBankList() {
        val nameBanks = ArrayList<String>()
        val bank = BankModel("ViettinBank", "1008-6933-6753", "Ngô Đại Phúc")
        val bank1 = BankModel("TPBank", "2112-047-0872", "Ngô Đại Phúc")
        bankList.add(bank)
        bankList.add(bank1)
        bankList.forEach { bankModel ->
            nameBanks.add(bankModel.nameBank)
        }

        val adapter = ArrayAdapter(requireContext(), R.layout.item_spinner, nameBanks)
        spinnerBank.adapter = adapter
        spinnerBank.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            @SuppressLint("SimpleDateFormat", "SetTextI18n")
            override fun onItemSelected(
                parent: AdapterView<*>, view: View, position: Int, id: Long
            ) {
                tvBank.text = bankList[position].nameBank
                tvName.text = bankList[position].namePerson
                tvNumber.text = bankList[position].number

                val sdf = SimpleDateFormat("yyyyMMdd_hhmm_")
                val currentDate = sdf.format(Date())
                val min = 1000
                val max = 9999
                val random = Random().nextInt(max - min + 1) + min
                tvContent.text = currentDate + random
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
    }

    companion object {
        const val EMAIL: String = "EMAIL";
    }
}