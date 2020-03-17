package com.example.retrofittitle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofittitle.R
import com.example.retrofittitle.model.Post
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter(var postList: List<Post>) :RecyclerView.Adapter<PostAdapter.PostViewHolder>(){
    inner class PostViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    fun bindPost(post: Post){
        itemView.txtTitle.text=post.title
    }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindPost(postList[position])

    }
}