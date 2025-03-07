package com.example.foodapp.models

data class Dishes(
    val id : Int,
    val name : String,
    val image : String,
    val stars : String,
    val cost : String
)


val dishesList = listOf(
    Dishes(
        id = 1,
        name = "Whopper",
        image = "https://burgerking.com.cy/sites/default/files/Whopper%20Cheese-01_1.png",
        stars = "4.5",
        cost = "$99.8"
    ),
    Dishes(
        id = 2,
        name = "Big Mac",
        image = "https://png.pngtree.com/png-clipart/20241127/original/pngtree-beef-big-mac-no-dig-material-png-image_17335682.png",
        stars = "4.6",
        cost = "$79.8"
    ),
    Dishes(
        id = 3,
        name = "Chicken fries",
        image = "https://kfc.ee/wp-content/uploads/2021/10/Fries_L.png",
        stars = "4.3",
        cost = "$58.9"
    ),
    Dishes(
        id = 4,
        name = "McFlurry",
        image = "https://www.portafolio.co/files/article_content/files/crop/uploads/2024/10/18/6712ea6fdccbc.r_2629158.0-507-1024-1069.png",
        stars = "4.7",
        cost = "$49.8"
    ),
    Dishes(
        id = 4,
        name = "Fried Chicken",
        image = "https://pngimg.com/d/kfc_food_PNG35.png",
        stars = "4.2",
        cost = "$99.9"
    ))

