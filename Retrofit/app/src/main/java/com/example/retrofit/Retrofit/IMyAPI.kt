package com.example.retrofit.Retrofit

import com.example.retrofit.Model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {
    @get:GET("posts")
    val posts : Observable<List<Post>>
}