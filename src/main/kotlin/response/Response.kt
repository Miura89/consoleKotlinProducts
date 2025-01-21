package org.example.response

class Response(var flag: Boolean,  val message: MutableList<String> = mutableListOf())
{
    fun addMessage(msg: String)
    {
        message.add(msg)
    }
    fun addMessage(msg: List<String>)
    {
        message.addAll(msg)
    }
    fun clearMessage()
    {
        message.clear()
    }
}