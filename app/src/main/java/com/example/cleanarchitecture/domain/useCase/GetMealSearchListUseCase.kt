package com.example.cleanarchitecture.domain.useCase

import com.example.cleanarchitecture.domain.repositry.MealSearchRepositry
import javax.inject.Inject

class GetMealSearchListUseCase @Inject constructor(private val repositry : MealSearchRepositry){
}