package com.example.exam6.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://run.mocky.io"
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ApiService{
    @GET("v3/dcf53e65-7f49-4a95-8b72-4d642e6436b1")
    suspend fun getData():List<ParsedJson>
}

object Api{
    val retrofitService:ApiService by lazy{
        retrofit.create(ApiService::class.java)
    }
}