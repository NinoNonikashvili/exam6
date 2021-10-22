package com.example.exam6.network


import com.google.gson.annotations.SerializedName

data class ParsedJson(
    @SerializedName("content")
    val content: List<Content>?
)