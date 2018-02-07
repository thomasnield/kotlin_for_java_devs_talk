package org.nield.ex5


fun main(args: Array<String>) {

    val myValue: String? = null

    if (myValue != null) {
        val length = myValue.length // okay

        println(length)
    }
}