package org.nield.ex14_map_and_companion

fun main(args: Array<String>) {

    val map = mapOf(
            5 to "Alpha",
            6 to "Beta",
            3 to "Gamma",
            7 to "Delta",
            11 to "Epsilon"
    )

    println(map[6])
    println(map[8])
}