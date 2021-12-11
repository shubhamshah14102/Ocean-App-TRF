package com.example.api_basic

import com.google.gson.annotations.SerializedName

class model (
    val id : Int,
    val userId: Int,
    val completed: String,
    @SerializedName("title")
    val mtitle : String
        )