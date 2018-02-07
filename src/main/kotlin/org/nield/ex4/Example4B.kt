package org.nield.ex4

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt())
}

fun generateRandomInt(): Int {
    return ThreadLocalRandom.current().nextInt()
}
