package com.example.appsell.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.appsell.R
import com.example.appsell.adapter.ProductAdapter
import com.example.appsell.base.Constant
import com.example.appsell.base.Until
import com.example.appsell.model.Order
import com.example.appsell.model.Product
import com.example.appsell.viewmodel.MainViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import kotlinx.android.synthetic.main.fragment_list_product.*

class ListProductFragment : Fragment() {
    lateinit var viewModel: MainViewModel

    lateinit var adapter: ProductAdapter
    private val products: ArrayList<Product> = ArrayList()
    val orderList = ArrayList<Order>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callBack: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                parentFragment?.findNavController()?.popBackStack()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callBack)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if( arguments?.getBoolean(HomeFragment.MANAGER)==true){
            txtOpenCart.visibility = View.INVISIBLE
        }else{
            txtOpenCart.visibility = View.VISIBLE
        }


        val allPost = Firebase.database.reference.child("products")
            .child(arguments?.getString(Constant.PRODUCT_TYPE)!!)

        Until.showLoading(requireActivity())
        allPost.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                products.clear()
                orderList.clear()

                for (postSnapshot in snapshot.children) {
                    val product: Product? = postSnapshot.getValue(Product::class.java)
                    product?.let {
                        products.add(it)
                    }
                }

                products.forEach {
                    orderList.add(Order(it, 0))
                }

                orderList.forEach default@{ orderDefault ->
                    viewModel.listProduct.forEach listModel@{
                        if (orderDefault.product?.key == it.product?.key) {
                            orderDefault.count = it.count
                            return@listModel
                        }

                    }
                }

                adapter = ProductAdapter(requireContext(), false,
                    arguments?.getBoolean(HomeFragment.MANAGER)!!
                )
                list.adapter = adapter
                list.addItemDecoration(
                    DividerItemDecoration(
                        requireContext(),
                        DividerItemDecoration.VERTICAL
                    )
                )
                adapter.submitList(orderList, true)

                adapter.updateCountListener { count, position ->
                    orderList[position].count = count
                    adapter.notifyItemChanged(position)
                    orderList.forEach default@{ orderDefault ->
                        if (orderDefault.count > 0) {

                            viewModel.listProduct.forEach listModel@{
                                if (orderDefault.product?.key == it.product?.key) {
                                    it.count = orderDefault.count
                                    return@default
                                }
                            }

                            viewModel.listProduct.add(orderDefault)
                        }
                    }
                }

                adapter.onClickViewMainListener {
                    val isManger = arguments?.getBoolean(HomeFragment.MANAGER) ?: false

                    val product = orderList[it].product
                    val gson = Gson()
                    val jsonProduct = gson.toJson(product)

                    val bundleProduct = Bundle().apply {
                        putString(DATA, jsonProduct)
                    }

                    if (isManger) {
                        findNavController().navigate(
                            R.id.action_listProductFragment_to_newProductFragment,
                            bundleProduct
                        )
                    } else {
                        findNavController().navigate(
                            R.id.action_listProductFragment_to_productDetailFragment,
                            bundleProduct
                        )
                    }

                }

                Until.hideLoading()
            }

            override fun onCancelled(error: DatabaseError) {
                Until.hideLoading()
            }
        })

        btn_back.setOnClickListener {
            findNavController().popBackStack()
        }

        txtOpenCart.setOnClickListener {
//            val carts = ArrayList<Order>()
            val bundle = Bundle().apply {
                Gson()

                val email: String = arguments?.getString(LoginFragment.EMAIL)!!
//
//                putString(CART, gson.toJson(viewModel.listProduct))
                putString(LoginFragment.EMAIL, email)
            }

            findNavController().navigate(R.id.action_listProductFragment_to_cartFragment, bundle)
        }
    }

    companion object {
        const val CART: String = "cart_data"
        const val DATA: String = "edit_data"
    }

}