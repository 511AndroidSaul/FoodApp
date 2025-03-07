package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.foodapp.models.Dishes
import com.example.foodapp.models.dishesList
import com.example.foodapp.ui.theme.primaryColor


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun BestDishes(dishes: Dishes){
    Box(
        modifier = Modifier
            .height(110.dp)
            .width(110.dp)

    ){
        GlideImage(
            model = dishes.image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(7.dp))
                .background(primaryColor)
                .align(Alignment.BottomEnd)
                .padding(3.dp)

        ){
            Text(dishes.cost)
        }

    }
}

@Preview
@Composable
fun BestDishesPreview(){
    BestDishes(dishes = dishesList[0])
}