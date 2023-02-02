package com.example.cleanarchitecture.data.repositry

import com.example.cleanarchitecture.data.modal.MealDTO
import com.example.cleanarchitecture.domain.remote.MealSearchAPI
import com.example.cleanarchitecture.domain.repositry.MealDetailRepositry

class GetMealDetailImp(private val mealSearchAPI: MealSearchAPI) : MealDetailRepositry {
    override suspend fun getMealDetail(s: String): MealDTO {
        return mealSearchAPI.getMealDetail(s)
    }
}