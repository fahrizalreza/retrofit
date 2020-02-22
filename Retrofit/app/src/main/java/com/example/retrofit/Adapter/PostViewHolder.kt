package com.example.retrofit.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_layout.view.*

class PostViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
    val titleTxt = itemView.titleTxt
    val contentTxt = itemView.contentTxt
    val authorTxt = itemView.authorTxt
}