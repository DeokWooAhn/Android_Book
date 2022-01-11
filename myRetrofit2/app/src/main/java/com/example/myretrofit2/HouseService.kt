package com.example.myretrofit2

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/b8384223-152e-4d1a-a90c-f793731e5715")
    fun getHouseList(): Call<HouseDto>
}