package org.nield.ex5_nullability

fun main(args: Array<String>) {

    val myValue: String? = null

    val length = myValue.length // error

    println(length)
}