package org.example.view

class menuView {
    fun menu() : String?
    {
        println("Seja bem vindo ao APP")
        println("")
        println(
            """
            0 - Sair
            1 - Cadastrar Cliente
            2 - Cadastrar Empresa
            3 - Verificar Pedidos
            4 - Fazer Pedido
        """.trimIndent()
        )
        println("Digite sua opção: ")

        val resposta = readLine()
        return resposta
    }
}