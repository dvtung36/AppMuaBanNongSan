package com.example.appsell.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appsell.R
import com.example.appsell.base.Until
import com.example.appsell.model.Product
import kotlinx.android.synthetic.main.item_image_new_product.view.imageProduct
import kotlinx.android.synthetic.main.item_like_product.view.*

@Suppress("UNREACHABLE_CODE")
class LikeProductAdapter(private var products: List<Product>?, private var listener: OnItemClickListener) :
    RecyclerView.Adapter<LikeProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_like_product, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return products!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val holderBookStore: ViewHolder = holder
        holderBookStore.binItems(position)
        holder.itemView.width
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor", "SetTextI18n")
        fun binItems(pos: Int) {
            val imageURLs = ArrayList<String>()
            products?.get(pos)?.urlImage?.let { s->
                for (i in stringToWords(s).indices) {
                    imageURLs.add(stringToWords(s)[i].replace(",", "")).toString()
                }
            }
            Glide.with(itemView.context)
                .load(imageURLs[0].replace(",", ""))
                .error(R.drawable.bg_default)
                .into(itemView.imageProduct)
            itemView.textViewName.text = products?.get(pos)?.productName
            itemView.textViewPrice.text = Until.formatNumber(products?.get(pos)?.cost) + "  VND"

            itemView.setOnClickListener { listener.onItemClick(products!![pos]) }
        }
    }

    fun stringToWords(s : String) = s.trim().splitToSequence(' ')
        .filter { it.isNotEmpty() } // or: .filter { it.isNotBlank() }
        .toList()

    interface OnItemClickListener {
        fun onItemClick(product: Product)
    }

}