package org.nield.ex4_1_functions

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    printRandomInt()
}

fun printRandomInt() {
    val randomInt = ThreadLocalRandom.current().nextInt()
    println(randomInt)
}