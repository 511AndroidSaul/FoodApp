package com.example.foodapp.models

data class FoodBrand(
    val id : Int,
    val name : String,
    val image : String
)

val foodBrandList = listOf(
    FoodBrand(
        id = 1,
        name = "Burger King",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Burger_King_2020.svg/940px-Burger_King_2020.svg.png"
    ),
    FoodBrand(
        id = 2,
        name = "McDonald´s",
        image = "https://1000marcas.net/wp-content/uploads/2019/11/McDonalds-logo.png"
    ),
    FoodBrand(
        id = 3,
        name = "KFC",
        image = "https://1000marcas.net/wp-content/uploads/2020/01/KFC-logo.png"
    ),
    FoodBrand(
        id = 4,
        name = "Dominos",
        image = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/1200px-Domino%27s_pizza_logo.svg.png"
    ),FoodBrand(
        id = 5,
        name = "Wendy´s",
        image = "https://static.wikia.nocookie.net/logopedia/images/1/11/Wendy%27s_2013.svg/revision/latest/scale-to-width-down/200?cb=20220510045746&path-prefix=es"
    ))