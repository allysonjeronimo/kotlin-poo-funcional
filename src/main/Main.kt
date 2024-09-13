package main

import model.Product

fun main(){

    val products = createProducts()

    printProductsByCategory("Games", products)
    printProductsByPrice(4000f, products)
}

fun createProducts() : List<Product>{
    return listOf(
        Product(1, "Xbox", 2000f, "Games"),
        Product(2, "Playstation 5 PRO", 10000f, "Games"),
        Product(3, "Switch", 1700f, "Games"),
        Product(4, "Notebook", 4500f, "Informática"),
        Product(5, "Kindle", 400f, "Livros"),
    )
}

fun printProducts(products: List<Product>){
    products.forEach {
        p -> println(p)
    }
}

fun printProductsByCategory(category: String, products: List<Product>){
    println("By Category")
    val result = products.filter {
        it.category == category
    }
    printProducts(result)
}

fun printProductsByPrice(price: Float, products: List<Product>){
    println("By Price")
    val result = products.filter { p ->
        p.price >= price
    }
    printProducts(result)
}