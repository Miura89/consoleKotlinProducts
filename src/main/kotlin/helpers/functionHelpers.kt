package org.example.helpers

import kotlin.random.Random

class functionHelpers {
    fun generateId(): Int
    {
        return Random.nextInt(0, 9999)
    }
}