package com.example.retrofit.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.Model.Post
import com.example.retrofit.R
import java.lang.StringBuilder

class PostAdapter (internal var context : Context, internal var postList : List<Post>)
    :RecyclerView.Adapter<PostViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.post_layout, parent, false)

        return PostViewHolder(itemView)
    }

    override fun getItemCount(): Int {

        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.titleTxt.text = postList[position].title
        holder.contentTxt.text = StringBuilder(postList[position].body.substring(0, 20)).append("...".toString())
        holder.authorTxt.text = postList[position].userId.toString()
    }

}