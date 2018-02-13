package org.nield.ex5_nullability


fun main(args: Array<String>) {

    val myValue: String? = null

    if (myValue != null) {
        val length = myValue.length // okay

        println(length)
    }
}