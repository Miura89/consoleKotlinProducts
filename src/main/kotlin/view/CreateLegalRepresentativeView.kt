package org.example.view

import org.example.helpers.functionHelpers
import org.example.model.RepresentanteLegal

class CreateLegalRepresentativeView(private val functions: functionHelpers) {
    fun getLegalRepresentative(): RepresentanteLegal{
        println("Name: ")
        val name = readLine()!!
        println("Email: ")
        val email = readLine()!!
        println("Phone: ")
        val phone = readLine()!!
        println("Password: ")
        val password = readLine()!!

        val legalRepresentative = RepresentanteLegal(
            functions.generateId(),
            name =  name,
            email = email,
            phone = phone,
            senha = password,
        )
        return legalRepresentative
    }
}