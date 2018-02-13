package org.nield.ex5_nullability

fun main(args: Array<String>) {

    val myValue: String? = "Foxtrot"

    val length = myValue?.length?:0

    println(length)
}