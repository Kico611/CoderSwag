package com.ignite.coderswag.Services

import com.ignite.coderswag.Model.Category
import com.ignite.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie", "hat01", "$18"),
        Product("Devslopes Hat Black", "hat02", "$20"),
        Product("Devslopes Hat White", "hat03", "$18"),
        Product("Devslopes Hat Snapback", "hat04", "$22")
    )
    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "hoodie01", "$28"),
        Product("Devslopes Hoodie Red", "hoodie02", "$32"),
        Product("Devslopes Gray Hoodie", "hoodie03", "$28"),
        Product("Devslopes Black Hoodie", "hoodie04", "$32")
    )
    val shirts = listOf(
        Product("Devslopes Shirt Black", "shirt01", "$18"),
        Product("Devslopes Badge Light Gray", "shirt02", "$20"),
        Product("Devslopes Logo Shirt Red", "shirt03", "$22"),
        Product("Devslopes Hustle", "shirt04", "$22"),
        Product("Kickflip Studios","shirt05", "$18")
    )
}