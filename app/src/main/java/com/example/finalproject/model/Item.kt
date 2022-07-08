package com.example.finalproject.model

import java.io.Serializable

data class Item(
    var name: String = "",
    var actualName: String = "",
    var advertisement: String = "",
    var price: String = "",
    var material: String = "",
    var tips: String = "",
    var img: Int = 0
) : Serializable
