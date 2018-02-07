package org.nield.ex4_1

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt(100, 200))
}

fun generateRandomInt(min: Int, max: Int) =
        ThreadLocalRandom.current().nextInt(min, max + 1)