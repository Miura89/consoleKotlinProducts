package org.example.model

data class Order(
    val id: Int,
    val product: Products,
    val client: Cliente,
    val clientName: String,
    val clientPhone: String,
    val productName: String,
    val productPrice: Double
)