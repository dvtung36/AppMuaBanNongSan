package com.example.appsell.adapter

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appsell.R
import kotlinx.android.synthetic.main.fragment_product_detail.*
import kotlinx.android.synthetic.main.item_image_new_product.view.*

@Suppress("UNREACHABLE_CODE")
class ImageProductDetailAdapter(private var urls: List<String>?) :
    RecyclerView.Adapter<ImageProductDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_new_product, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return urls!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val holderBookStore: ViewHolder = holder
        holderBookStore.binItems(urls!![position])
        holder.itemView.width
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor", "SetTextI18n")
        fun binItems(url: String?) {
            Glide.with(itemView.context)
                .load(url)
                .error(R.drawable.bg_default)
                .into(itemView.imageProduct)
        }
    }

}