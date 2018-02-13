package org.nield.ex4_2_functions

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt())
}
fun generateRandomInt() = ThreadLocalRandom.current().nextInt()