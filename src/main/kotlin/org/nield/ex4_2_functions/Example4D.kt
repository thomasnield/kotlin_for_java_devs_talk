package org.nield.ex4_2_functions

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt(100, 200))
}

fun generateRandomInt(min: Int, max: Int) =
        ThreadLocalRandom.current().nextInt(min, max + 1)