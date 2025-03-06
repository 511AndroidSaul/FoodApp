package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.models.Food
import com.example.foodapp.models.foodList
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.primaryColor


@Composable
fun FoodCard(food: Food){
    Box(
        
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(primaryColor)
            .height(90.dp)
            .width(90.dp)

    ){
        GlideImage(
            model = food.image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        ){}
    }
}

@Preview
@Composable
fun FoodCardPreview(){
    FoodAppTheme {
        FoodCard(food = foodList[0])
    }

}
