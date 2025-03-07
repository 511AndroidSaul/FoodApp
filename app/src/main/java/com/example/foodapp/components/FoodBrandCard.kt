package com.example.foodapp.components


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.foodapp.models.FoodBrand
import com.example.foodapp.models.foodBrandList



@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FoodBrandCard(foodBrand: FoodBrand){
    Box(
        modifier = Modifier
            .height(90.dp)
            .width(90.dp)

    ){
        GlideImage(
            model = foodBrand.image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun FoodBrandPreview(){
    FoodBrandCard(foodBrand = foodBrandList[0])
}