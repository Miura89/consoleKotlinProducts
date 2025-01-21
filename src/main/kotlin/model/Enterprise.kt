package org.example.model

data class Enterprise(
    val id: Int,
    val representantId: Int,
    val name: String,
    val cnpj: String,
    val phone: String,
    val representanteLegal: RepresentanteLegal? = null,
    val products: List<Products>? = listOf()
)
