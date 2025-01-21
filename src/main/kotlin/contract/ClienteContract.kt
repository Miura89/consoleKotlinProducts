package org.example.contract

import org.example.model.Cliente
import org.example.response.Response

class ClienteContract {
    fun validate(client: Cliente) : Response{
        val response = Response(true)
        if(client.id < 0)
            response.addMessage("Id can not be less than 0")
        if(client.name.length < 3)
            response.addMessage("Name can not be less than 3 characters")
        if(client.secondName.length < 3)
            response.addMessage("Second name can not be less than 3 characters")
        if(client.age < 18)
            response.addMessage("Age can not be less than 18")
        if(client.cpf.length < 11)
            response.addMessage("Cpf can not be less than 11")
        if (client.password.length >= 10 && client.password[0].isUpperCase()) {
            response.addMessage("Password is valid")
        } else {
            response.addMessage("The password must be at least 10 characters long and start with an uppercase letter")
        }
        return response
    }
}