package com.example.cleanarchitecture.domain.repositry

import com.example.cleanarchitecture.data.modal.MealDTO

interface MealDetailRepositry {

    suspend fun getMealDetail(s : String) : MealDTO
}