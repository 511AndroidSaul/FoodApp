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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.ui.theme.primaryColor
import com.example.foodapp.utils.Logout
import com.example.foodapp.utils.PersonCircle

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
            .padding(20.dp)
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
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 22.dp))
        //falta agregar la fuente y el estilo

        //Spacer(modifier = Modifier.height(200.dp))
        // TabBar
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    selectedTab = "Noticias"
                    Log.i("HomeScreenJuan","Presionando columna noticias")
                }
            ) {
                Text(
                    text ="Noticias",
                    fontSize = 25.sp,
                    fontWeight = if(selectedTab == "Noticias") FontWeight.Bold else FontWeight.Light,
                    color = if(selectedTab == "Noticias") Color.Black else Color.LightGray
                )
                if(selectedTab == "Noticias"){
                    Box(modifier = Modifier
                        .height(5.dp)
                        .width(45.dp)
                        .background(primaryColor)
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text ="Eventos",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Box(modifier = Modifier
                    .height(5.dp)
                    .width(45.dp)
                    .background(primaryColor)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text ="Clima",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Box(modifier = Modifier
                    .height(5.dp)
                    .width(45.dp)
                    .background(primaryColor)
                )
            }
        }
        Button(onClick = {
            counter++
            Log.d("HomeScreenJuan",counter.toString())
        }) {
            Text("Presionar")
        }
        Text(counter.toString(), fontSize = 26.sp)
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