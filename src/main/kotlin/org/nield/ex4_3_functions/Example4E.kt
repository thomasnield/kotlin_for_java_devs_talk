package org.nield.ex4_3_functions

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt(max=200, min=100))
}

fun generateRandomInt(min: Int, max: Int) =
        ThreadLocalRandom.current().nextInt(min, max + 1)