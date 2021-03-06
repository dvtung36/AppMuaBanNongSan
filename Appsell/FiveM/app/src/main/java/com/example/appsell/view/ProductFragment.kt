package com.example.appsell.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.appsell.R
import com.example.appsell.adapter.MenuProductAdapter
import com.example.appsell.base.Constant
import com.example.appsell.model.MenuProduct
import kotlinx.android.synthetic.main.product_fragment.*

class ProductFragment : Fragment() {

    lateinit var adapter: MenuProductAdapter

    lateinit var data: ArrayList<MenuProduct>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.product_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if( arguments?.getBoolean(HomeFragment.MANAGER)==true){
            txtOpenCart.visibility = View.INVISIBLE
        }else{
            txtOpenCart.visibility = View.VISIBLE
        }


        btn_back.setOnClickListener {
            findNavController().popBackStack()
        }

        txtOpenCart.setOnClickListener {
            val email: String = arguments?.getString(LoginFragment.EMAIL)!!
            val bundle = Bundle().apply {
                putString(LoginFragment.EMAIL, email)
                putBoolean(HomeFragment.MANAGER, arguments?.getBoolean(HomeFragment.MANAGER)!!)
            }
            findNavController().navigate(R.id.action_productFragment_to_cartFragment, bundle)
        }

        data = ArrayList()
        data.add(MenuProduct(requireContext().getString(R.string.vegetable)) )
        data.add(MenuProduct(requireContext().getString(R.string.packaged_food)) )
        data.add(MenuProduct(requireContext().getString(R.string.fresh_meat)) )
        data.add(MenuProduct(requireContext().getString(R.string.different)) )
        data.add(MenuProduct(requireContext().getString(R.string.ha)))
        data.add(MenuProduct(requireContext().getString(R.string.dokho)))
        data.add(MenuProduct(requireContext().getString(R.string.donglanh)))
        data.add(MenuProduct(requireContext().getString(R.string.traicay)))
        data.add(MenuProduct(requireContext().getString(R.string.nuocngot)))



        adapter = MenuProductAdapter(requireContext())

        list.adapter = adapter

        list.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )

        adapter.submitList(data, true)

        adapter.setOnItemClickListener {
            val bundle = Bundle()

            when (it) {
                0 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_VEGETABLE)

                1 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_PACKAGED)

                2 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_MEAT)

                3 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_DIFFERENT)

                4 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_HA)

                5 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_DOKHO)

                6 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_DONGLANH)

                7 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_TRAICAY)

                8 -> bundle.putString(Constant.PRODUCT_TYPE, Constant.PRODUCT_NUOCNGOT)
            }

            bundle.putBoolean(HomeFragment.MANAGER, arguments?.getBoolean(HomeFragment.MANAGER) ?: false)
            bundle.putString(LoginFragment.EMAIL, arguments?.getString(LoginFragment.EMAIL))
            bundle.putBoolean(HomeFragment.MANAGER, arguments?.getBoolean(HomeFragment.MANAGER)!!)
            findNavController().navigate(R.id.action_productFragment_to_listProductFragment, bundle)
        }

    }

}