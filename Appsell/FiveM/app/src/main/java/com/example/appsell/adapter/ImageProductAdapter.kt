package com.example.appsell.adapter

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appsell.R
import kotlinx.android.synthetic.main.item_image_new_product.view.*

@Suppress("UNREACHABLE_CODE")
class ImageProductAdapter(private var uris: List<Uri>?) :
    RecyclerView.Adapter<ImageProductAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_image_new_product, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return uris!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val holderBookStore: ViewHolder = holder
        holderBookStore.binItems(uris!![position])
        holder.itemView.width
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor", "SetTextI18n")
        fun binItems(uri: Uri?) {
            itemView.imageProduct.setImageURI(uri)
        }
    }

}