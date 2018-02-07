package org.nield.ex4_1

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println(generateRandomInt())
}
fun generateRandomInt() = ThreadLocalRandom.current().nextInt()