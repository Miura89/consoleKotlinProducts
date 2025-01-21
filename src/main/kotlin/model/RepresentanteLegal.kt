package org.example.model

data class RepresentanteLegal(
    val id: Int,
    val enterpriseId: Int? = null,
    val name: String,
    val email: String,
    val phone: String,
    val senha: String,
    val enterprise: Enterprise? = null
)
