package org.example.view

import org.example.helpers.functionHelpers
import org.example.model.Enterprise
import org.example.model.RepresentanteLegal

class CreateEnterpriseView(
    private val functionHelpers: functionHelpers
) {
    fun getEnterpriseData() : Enterprise
    {
        println("Enterprise Name: ")
        val name = readLine()!!
        println("CNPJ: ")
        val cnpj = readLine()!!
        println("Phone: ")
        val phone = readLine()!!
        println("Representant Legal Id: ")
        val representantId = readLine()!!.trim().toInt()

        val enterprise = Enterprise(
            functionHelpers.generateId(),
            representantId,
            name,
            cnpj,
            phone
        )
        return enterprise
    }
}