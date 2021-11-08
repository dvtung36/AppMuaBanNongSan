package com.example.appsell.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appsell.R
import com.example.appsell.model.Comment
import kotlinx.android.synthetic.main.item_comment.view.*

@Suppress("UNREACHABLE_CODE")
class CommentAdapter(private var comments: List<Comment>?) :
    RecyclerView.Adapter<CommentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_comment, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return comments!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val holderBookStore: ViewHolder = holder
        holderBookStore.binItems(position)
        holder.itemView.width
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @SuppressLint("ResourceAsColor", "SetTextI18n")
        fun binItems(pos: Int) {
            itemView.textViewUser.text = comments?.get(pos)?.user
            itemView.textViewComment.text = comments?.get(pos)?.comment
            itemView.textViewTime.text = comments?.get(pos)?.time
            if (pos == comments?.size!! - 1) {
                itemView.line.visibility = View.GONE
            }
        }
    }

}