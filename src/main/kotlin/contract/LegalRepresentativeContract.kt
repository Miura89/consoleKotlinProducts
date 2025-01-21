package org.example.contract

import org.example.model.RepresentanteLegal
import org.example.response.Response

class LegalRepresentativeContract {
    fun validate(representative: RepresentanteLegal) : Response{
        val response = Response(flag = true)
        if(representative.id < 0)
            response.addMessage("ID must be non-negative")
        if(representative.name.length < 3)
            response.addMessage("Name must be at least 3 characters")
        if(representative.email.length < 3)
            response.addMessage("Email must be at least 3 characters")
        if(representative.phone == null)
            response.addMessage("Phone must be non-null")
        if(representative.senha == null || representative.senha.length < 10)
            response.addMessage("Senha must be non-null and more than 10 caracteres")

        return response
    }
}