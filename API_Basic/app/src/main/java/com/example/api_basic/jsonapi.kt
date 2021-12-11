package com.example.api_basic

import retrofit2.Call
import retrofit2.http.GET

interface jsonapi {
    //https://jsonplaceholder.typicode.com/todos
    @GET("todos")
    fun getInfo(): Call<List<model>>
}