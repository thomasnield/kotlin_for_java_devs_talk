package org.nield.ex14_map_and_companion

fun main(args: Array<String>) {

    val strings = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    val stringsByLengths = strings.asSequence()
            .map { it.length to it  }
            .toMap()

    println(stringsByLengths)
}