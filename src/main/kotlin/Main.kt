package org.example

import org.example.contract.ClienteContract
import org.example.contract.LegalRepresentativeContract
import org.example.helpers.functionHelpers
import org.example.model.Cliente
import org.example.model.Order
import org.example.model.Products
import org.example.model.RepresentanteLegal
import org.example.view.CreateLegalRepresentativeView
import org.example.view.createClient
import org.example.view.menuView

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val clientes = mutableListOf<Cliente>()
    val products = mutableListOf<Products>()
    val order = mutableListOf<Order>()
    val representativesEntity = mutableListOf<RepresentanteLegal>()
    val menu = menuView()
    val helper = functionHelpers()
    val menuClient = createClient(helper)
    val menuRepresentative = CreateLegalRepresentativeView(helper)
    val clienteContract = ClienteContract()
    val representative = LegalRepresentativeContract()

    while (true) {
        val op = menu.menu()
        if(op == "0")
            break
        else if (op == "1"){
            println("Lets create your profile!")
            val client = menuClient.getClient()
            val validate = clienteContract.validate(client)
            if(validate.message.count() > 0)
                validate.message.forEach{
                    println(it)
                }
            else
            {
                clientes.add(client)
                println("Client: ${client.name} created successfully")
            }
        }
        else if(op == "2")
        {
            println("Lets Create Your Enterprise")
            println("Do you have a legal representative id?")
            val r = readLine()!!
            if(r == "y" || r == "yes" || r == "Y" || r == "Yes")
                break
            else
            {
                println("Lets create a representative legal")
                val representativeMenu = menuRepresentative.getLegalRepresentative()
                val validate = representative.validate(representativeMenu)
                if(validate.message.count() > 0)
                    validate.message.forEach{
                        println(it)
                    }
                else{
                    representativesEntity.add(representativeMenu)
                    println("Representative: ${representativeMenu.name} created successfully")
                    println("Save this id ${representativeMenu.id} to create your enterprise")
                }
            }
        }
    }
}