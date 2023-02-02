package com.example.cleanarchitecture.data.repositry

import com.example.cleanarchitecture.data.modal.MealDTO
import com.example.cleanarchitecture.domain.remote.MealSearchAPI
import com.example.cleanarchitecture.domain.repositry.MealSearchRepositry

class GetSearchMealListImp(private val mealSearchAPI: MealSearchAPI) : MealSearchRepositry {
    override suspend fun getMealList(s: String): MealDTO {
        return mealSearchAPI.getMealList(s)
    }
}