package com.example.cleanarchitecture.domain.remote

import com.example.cleanarchitecture.data.modal.MealDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface MealSearchAPI {

    @GET("search.php")
    suspend fun getMealList(@Query("s") strnangName : String) : MealDTO
    @GET("lookup.php")
    suspend fun getMealDetail(@Query("i") i : String) : MealDTO
}