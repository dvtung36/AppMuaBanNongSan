package com.example.appsell.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.appsell.R
import com.example.appsell.base.BaseAdapter
import com.example.appsell.base.Until
import com.example.appsell.model.Order
import kotlinx.android.synthetic.main.fragment_new_product.*
import kotlinx.android.synthetic.main.item_product.view.*
import java.util.*

class ProductAdapter(context: Context, val isCart: Boolean, var isManager:Boolean) : BaseAdapter<Order, ProductAdapter.ViewHolder>(context) {

    private val bgThumb: Array<Int> = arrayOf(
        R.color.customGreen, R.color.textColorOrange,
        R.color.azure, R.color.colorNegativeRemoved, R.color.textColorRedCrimson
    )

    private lateinit var onUpdateCount: (count: Int, position: Int) -> Unit
    private lateinit var onClickViewMain: (position: Int) -> Unit

    fun updateCountListener(onUpdateCount: (count: Int, position: Int) -> Unit) {
        this.onUpdateCount = onUpdateCount
    }

    fun onClickViewMainListener(onClickViewMain: (position: Int) -> Unit) {
        this.onClickViewMain = onClickViewMain
    }

    override fun getItemViewId(viewType: Int): Int = R.layout.item_product

    override fun getViewHolder(viewType: Int, itemView: View): ViewHolder {
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.bindView(position)
    }

    inner class ViewHolder(itemView: View) : BaseAdapter.ViewHolder(itemView) {
        @SuppressLint("SetTextI18n")
        fun bindView(position: Int) {
            val data = getItem(position)
            if(isManager){
                itemView.LinearLayout_count.visibility = View.INVISIBLE
            }
            else{
                itemView.LinearLayout_count.visibility = View.VISIBLE
            }
            itemView.apply {
                txtProductName.text = data.product?.productName
                txtCost.text = "" + Until.formatNumber(data.product?.cost) + " VND"
                txtDescription.text = "" + data.product?.description
                txt_count.text = "" + data.count
            }

//            itemView.img_increase.isVisible = !isCart
//            itemView.img_reduction.isVisible = !isCart

            itemView.img_increase.setOnClickListener {
                val count: Int = itemView.txt_count.text.toString().toInt()
                onUpdateCount.invoke(count + 1, position)
            }

            itemView.img_reduction.setOnClickListener {
                if (itemView.txt_count.text.toString().toInt() > 0) {
                    val count: Int = itemView.txt_count.text.toString().toInt()
                    onUpdateCount.invoke(count - 1, position)
                }
            }

            itemView.view_main.setOnClickListener {
                onClickViewMain.invoke(position)
            }

            val listURL = ArrayList<String>()

            data.product?.urlImage?.let {
                for (i in stringToWords(it).indices) {
                    listURL.add(stringToWords(it)[i])
                }
            }

            if (!data.product?.urlImage.isNullOrEmpty()) {
                val url = listURL[0].replace(",", "")

                Glide.with(context)
                    .load(url)
                    .apply(RequestOptions())
                    .fitCenter()
                    .into(itemView.imgPart)
            } else {
                itemView.imgPart.setImageDrawable(
                    ContextCompat.getDrawable(
                        context,
                        bgThumb[position % bgThumb.size]
                    )
                )

                val partNameSplit = data.product?.productName?.split(" ")
                var nameShort = String()
                partNameSplit?.forEachIndexed { index, string ->
                    if (index >= 2) {
                        return@forEachIndexed
                    }

                    if (string.trim().isNotEmpty()) {
                        nameShort += string[0]
                    }
                }

                itemView.txtPartShort.text = nameShort.toUpperCase(Locale("en"))
            }

        }
    }

    fun stringToWords(s : String) = s.trim().splitToSequence(' ')
        .filter { it.isNotEmpty() } // or: .filter { it.isNotBlank() }
        .toList()

}