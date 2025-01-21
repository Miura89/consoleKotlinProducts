package org.example.view

import org.example.contract.ClienteContract
import org.example.helpers.functionHelpers
import org.example.model.Cliente
import kotlin.random.Random

class createClient(
    private  val functionHelpers: functionHelpers
) {
    fun getClient() : Cliente
    {
        println("Your name: ")
        val name = readLine()!!
        println("Your second name: ")
        val secondName = readLine()!!
        println("Your age: ")
        val age = readLine()!!.toInt()
        println("Your CPF: ")
        val cpf = readLine()!!
        println("Your Phone: ")
        val phone = readLine()!!
        println("Your email: ")
        val email = readLine()!!
        println("Your password: ")
        val password = readLine()!!

        val client = Cliente(
            functionHelpers.generateId(),
            name,
            secondName,
            age,
            cpf,
            phone,
            email,
            password
        )
        return client
    }
}