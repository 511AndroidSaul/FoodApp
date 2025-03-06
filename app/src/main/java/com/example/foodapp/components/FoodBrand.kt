package com.example.foodapp.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodapp.models.Food
import com.example.foodapp.models.foodList


@Composable
fun FoodBrand(food: Food){

}

@Preview
@Composable
fun FoodBrandPreview(){
    FoodImage(food = foodList[0])
}