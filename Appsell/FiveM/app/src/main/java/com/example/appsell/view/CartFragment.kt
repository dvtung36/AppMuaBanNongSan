package com.example.appsell.view

import android.annotation.SuppressLint
import android.os.Bundle
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
import com.example.appsell.base.Until
import com.example.appsell.model.Profile
import com.example.appsell.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_cart.*
import kotlinx.android.synthetic.main.fragment_cart.btn_back
import kotlinx.android.synthetic.main.fragment_cart.list
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_list_product.*
import java.util.*

class CartFragment : Fragment() {
    lateinit var viewModel: MainViewModel
    var profile: Profile = Profile()
    lateinit var adapter: ProductAdapter
    var totalCost = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val callBack: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                parentFragment?.findNavController()?.popBackStack(R.id.homeFragment, false)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(callBack)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val json = arguments?.getString(ListProductFragment.CART)
//        val gson = Gson()
//
//        val typeToken = object : TypeToken<ArrayList<Order>>() {}.type
//        val orders = gson.fromJson<ArrayList<Order>>(json, typeToken)

        totalCost()

        adapter = ProductAdapter(requireContext(), true,
            arguments?.getBoolean(HomeFragment.MANAGER)!!
        )
        list.adapter = adapter
        list.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )

        adapter.submitList(viewModel.listProduct, true)

        adapter.updateCountListener { count, position ->
            viewModel.listProduct[position].count = count
            adapter.notifyItemChanged(position)

            totalCost()
        }

        adapter.onClickViewMainListener {
            val dialog = DeleteProductDialog()
            dialog.show(childFragmentManager, this.tag)
            dialog.onClickDeleteListener {
                viewModel.listProduct.removeAt(it)
                adapter.notifyItemRemoved(it)
                totalCost()
            }
        }

        if (viewModel.listProduct.size == 0) {
            txtPayment.isEnabled = false
            txtPayment.animate().alpha(0.5f)
        } else {
            txtPayment.isEnabled = true
            txtPayment.animate().alpha(1f)
        }

        btn_back.setOnClickListener {
            findNavController().popBackStack(R.id.homeFragment, false)
        }

        txtPayment.setOnClickListener {
            val bundle = Bundle().apply {
                putString(InputCardFragment.EMAIL, arguments?.getString(LoginFragment.EMAIL)!!)
            }
            findNavController().navigate(R.id.action_cartFragment_to_inputCardFragment, bundle)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun totalCost() {
        totalCost = 0
        viewModel.listProduct.forEach {
            totalCost += it.count * it.product?.cost?.toInt()!!
        }

        txt_total.text = Until.formatNumber(totalCost.toLong()) + " VND"
    }

}