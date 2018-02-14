package org.nield.ex12_collections

fun main(args: Array<String>) {

    val vector = doubleArrayOf(1.0, 5.0, 6.0, 11.0)

    vector[2] = 3.0

    println(vector.joinToString(separator = ",", prefix = "[", postfix = "]"))
}