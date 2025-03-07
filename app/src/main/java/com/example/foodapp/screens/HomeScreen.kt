package com.example.foodapp.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.components.BestDishes
import com.example.foodapp.components.FoodBrandCard
import com.example.foodapp.components.FoodCard
import com.example.foodapp.models.Dishes
import com.example.foodapp.models.dishesList
import com.example.foodapp.models.foodBrandList
import com.example.foodapp.models.foodList
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.darkGreen
import com.example.foodapp.ui.theme.primaryColor
import com.example.foodapp.utils.Logout
import com.example.foodapp.utils.PersonCircle
import com.example.foodapp.utils.StarFull

@Composable
fun HomeScreen(innerPadding:PaddingValues){
    var counter by remember {
        mutableStateOf(0)
    }
    var selectedTab by remember{
        mutableStateOf("Noticias")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(12.dp)
    ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        ){
            Icon(imageVector = PersonCircle,
                contentDescription = null,
                modifier = Modifier.padding(end = 8.dp).size(28.dp),
                tint = primaryColor

                )
            Text("Hola, Saul",
                fontSize = 25.sp,
                modifier = Modifier.weight(1f))
                //falta agregar la fuente y el estilo

            Icon(
                imageVector = Logout,
                contentDescription = null,
                modifier = Modifier.padding(start = 8.dp).size(28.dp),
                tint = primaryColor
            )
        }

        Text("Nuestras Categorias",
                fontSize = 23.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 22.dp)
                    .padding(bottom = 17.dp))
        //falta agregar la fuente y el estilo

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ){
            items(foodList){food ->
                Column(
                    modifier = Modifier.height(120.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FoodCard(food = food)
                    Text(food.name)
                }

            }
        }

        Text("Busca los mejores restaurantes",
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 15.dp)
                .padding(bottom = 15.dp)
                .width(300.dp))
        //falta agregar la fuente y el estilo

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(18.dp)
        ){
            items(foodBrandList){ foodBrand ->
                Column(
                    modifier = Modifier.height(120.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FoodBrandCard(foodBrand = foodBrand)
                    Text(foodBrand.name)
                }

            }
        }
        Text("Nuestras mejores comidas",
            fontSize = 23.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 22.dp)
                .padding(bottom = 22.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(9.dp),
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(dishesList){dishes ->
                Column(
                    modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp)) {
                    BestDishes(dishes = dishes)
                    Row(){
                        Icon(imageVector = StarFull,
                            contentDescription = null,
                            modifier = Modifier.padding(end = 8.dp).size(18.dp),
                            tint = darkGreen
                        )
                        Text(dishes.stars +" "+ dishes.name,
                            fontSize = 15.sp
                        )
                    }

                }


            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL
)
@Composable
fun HomeScreenPreview(){
    FoodAppTheme {
        HomeScreen(innerPadding = PaddingValues(20.dp))
    }
}