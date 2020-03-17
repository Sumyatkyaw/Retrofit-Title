package com.example.retrofittitle.api

import com.example.retrofittitle.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface PostApiInterface{
@GET("posts")
fun getPost(): Call<List<Post>>
}