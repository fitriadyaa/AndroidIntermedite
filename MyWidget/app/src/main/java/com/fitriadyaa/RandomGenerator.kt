package com.fitriadyaa

import java.util.Random

internal object RandomGenerator {

    fun generate(max: Int): Int {
        val random = Random()
        return random.nextInt(max)
    }
}