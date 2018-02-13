package org.nield.ex5_nullability

fun main(args: Array<String>) {

    val myValue: String? = null

    val length: Int = myValue!!.length   // runtime error

    println(length)
}