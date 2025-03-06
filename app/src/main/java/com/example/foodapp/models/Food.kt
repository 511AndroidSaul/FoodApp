package com.example.foodapp.models

data class Food(
    val id : Int,
    val name : String,
    val image : String,
)

val foodList = listOf(
    Food(
        id = 1,
        name = "FastFood",
        image = "https://png.pngtree.com/png-clipart/20231018/original/pngtree-fast-food-cliparts-png-image_13354284.png"
    ),
    Food(
        id = 2,
        name = "Chinese",
        image = "https://pics.clipartpng.com/Asian_Fast_Food_PNG_Clip_Art-2541.png"
    ),
    Food(
        id = 3,
        name = "Italian",
        image = "https://png.pngtree.com/png-clipart/20231018/original/pngtree-fast-food-cliparts-png-image_13354284.png"
    ),
    Food(
        id = 4,
        name = "Mexican",
        image = "https://png.pngtree.com/png-clipart/20231018/original/pngtree-fast-food-cliparts-png-image_13354284.png"
    ),
    Food(
        id = 5,
        name = "Greek",
        image = "https://png.pngtree.com/png-clipart/20231018/original/pngtree-fast-food-cliparts-png-image_13354284.png"
    ),

)