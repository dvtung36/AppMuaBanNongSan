package com.example.appsell.view

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.appsell.R
import com.example.appsell.adapter.CommentAdapter
import com.example.appsell.adapter.LikeProductAdapter
import com.example.appsell.base.Constant
import com.example.appsell.base.Until
import com.example.appsell.model.Comment
import com.example.appsell.model.Product
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_product_detail.*
import kotlinx.android.synthetic.main.fragment_product_detail.btn_back
import com.example.appsell.adapter.ImageProductDetailAdapter
import com.example.appsell.utils.SharedPref
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class ProductDetailFragment : Fragment() {

    private var product: Product? = null
    private var type: String = Constant.PRODUCT_VEGETABLE
    private val products: ArrayList<Product> = ArrayList()
    private val comments: ArrayList<Comment> = ArrayList()

    private var adapter: ImageProductDetailAdapter? = null
    private var productAdapter: LikeProductAdapter? = null
    private var commentAdapter: CommentAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_product_detail, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        product_description.movementMethod = ScrollingMovementMethod()

        val json = arguments?.getString(ListProductFragment.DATA)

        json?.apply {
            val gson = Gson()
            product = gson.fromJson(json, Product::class.java)
            product?.let { it ->
                product_name.text = it.productName
                product_cost.text = Until.formatNumber(it.cost) + " VND"
                product_description.text = it.description

                val imageURLs = ArrayList<String>()
                product?.urlImage?.let { s ->
                    for (i in stringToWords(s).indices) {
                        imageURLs.add(stringToWords(s)[i].replace(",", "")).toString()
                    }
                }

                adapter = ImageProductDetailAdapter(imageURLs)
                val manager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                rcImage.layoutManager = manager
                rcImage.itemAnimator = DefaultItemAnimator()
                rcImage.adapter = adapter

                Glide.with(requireContext())
                    .load(imageURLs[0])
                    .error(R.drawable.bg_default)
                    .into(product_img)
            }
        }

        if (product != null) {
            type = product!!.type
            val text = when (product!!.type) {
                Constant.PRODUCT_VEGETABLE -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.vegetable
                )
                Constant.PRODUCT_PACKAGED -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.packaged_food
                )
                Constant.PRODUCT_MEAT -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.fresh_meat
                )
                Constant.PRODUCT_DIFFERENT -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.different
                )
                Constant.PRODUCT_HA -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.ha
                )
                Constant.PRODUCT_DOKHO -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.dokho
                )
                Constant.PRODUCT_DONGLANH -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.donglanh
                )
                Constant.PRODUCT_TRAICAY -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.traicay
                )
                Constant.PRODUCT_NUOCNGOT -> requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.nuocngot
                )
                else -> {
                    type = Constant.PRODUCT_VEGETABLE
                    requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                        R.string.vegetable
                    )
                }
            }
            product_type.text = text
        } else {
            product_type.text =
                requireContext().getString(R.string.type_product) + " " + requireContext().getString(
                    R.string.vegetable
                )
        }
        getRelativeProduct()
        getComment()

        btn_back.setOnClickListener {
            findNavController().popBackStack()
        }

        btn_confirm.setOnClickListener {
            findNavController().popBackStack()
        }

        buttonSend.setOnClickListener {
            Until.showLoading(requireContext() as Activity)
            sendComment()
        }
    }

    private fun getRelativeProduct() {
        val allPost = Firebase.database.reference
            .child("products")
            .child(product!!.type)
        allPost.addListenerForSingleValueEvent(object : ValueEventListener,
            LikeProductAdapter.OnItemClickListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                products.clear()
                for (postSnapshot in snapshot.children) {
                    val item: Product? = postSnapshot.getValue(Product::class.java)
                    item?.let {
                        if (item.key != product!!.key) {
                            products.add(it)
                        }
                    }
                }
                if (products.isEmpty()) {
                    tvProductTitle.visibility = View.GONE
                }

                productAdapter = LikeProductAdapter(products, this)
                val managerProduct =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                rcLikeProduct.layoutManager = managerProduct
                rcLikeProduct.itemAnimator = DefaultItemAnimator()
                rcLikeProduct.adapter = productAdapter
            }

            override fun onCancelled(error: DatabaseError) {

            }

            override fun onItemClick(product: Product) {
                val gson = Gson()
                val json = gson.toJson(product)

                val bundle = Bundle().apply {
                    putString(DATA, json)
                }

                findNavController().navigate(
                    R.id.action_productFragment_to_productFragment,
                    bundle
                )
            }
        })
    }

    private fun getComment() {
        val commentPost = Firebase.database.reference.child("products")
            .child(product!!.type)
            .child(product!!.key)
            .child("comments")
        commentPost.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                comments.clear()
                for (postSnapshot in snapshot.children) {
                    val item: Comment? = postSnapshot.getValue(Comment::class.java)
                    item?.let {
                        comments.add(it)
                    }
                }
                if (comments.isEmpty()) {
                    tvCommentTitle.visibility = View.GONE
                }

                commentAdapter = CommentAdapter(comments)
                val managerComment = LinearLayoutManager(context)
                rcComment.layoutManager = managerComment
                rcComment.itemAnimator = DefaultItemAnimator()
                rcComment.adapter = commentAdapter
            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
    }

    @SuppressLint("NotifyDataSetChanged", "SimpleDateFormat")
    private fun sendComment() {
        val sdf = SimpleDateFormat("yyyy/M/dd hh:mm")
        val currentDate = sdf.format(Date())
        val comment = Comment(
            SharedPref.getInstance(context).getUserName("userName"),
            editTextWriteComment.text.toString().trim(),
            currentDate.toString()
        )
        val database: FirebaseDatabase = FirebaseDatabase.getInstance()
        val reference: DatabaseReference = database.reference
        val key = database.reference.push().key!!

        reference.child("products").child(type)
            .child(product!!.key)
            .child("comments")
            .child(key).setValue(comment)
            .addOnSuccessListener {
                Until.hideLoading()
                Until.message("Add new successful comment\n", requireActivity())
                editTextWriteComment.text.clear()
                comments.add(comment)
                commentAdapter?.notifyDataSetChanged()
            }
            .addOnFailureListener {
                Until.hideLoading()
                Until.message(
                    it.message ?: "System error please try again",
                    requireActivity()
                )
            }
    }

    private fun stringToWords(s: String) = s.trim().splitToSequence(' ')
        .filter { it.isNotEmpty() } // or: .filter { it.isNotBlank() }
        .toList()

    companion object {
        const val DATA: String = "edit_data"
    }

}