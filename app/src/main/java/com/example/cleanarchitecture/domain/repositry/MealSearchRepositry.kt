package com.example.cleanarchitecture.domain.repositry

import com.example.cleanarchitecture.data.modal.MealDTO

interface MealSearchRepositry {

    suspend fun getMealList(s : String) : MealDTO
}