package org.example.model

data class Cliente(
    val id: Int,
    val name: String,
    val secondName: String,
    val age: Int,
    val cpf: String,
    val phone: String,
    val email: String,
    val password: String,
    val orders: List<Order>? = listOf()
)
