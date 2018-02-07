package org.nield.ex5

fun main(args: Array<String>) {

    val myValue: String? = null

    val length = myValue.length // error

    println(length)
}