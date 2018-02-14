package org.nield.ex13_collection_ops


fun main(args: Array<String>) {

    val strings = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    val distinctLetters = strings.flatMap { it.split("") }
            .filter { it.trim() != "" }
            .map { it.toUpperCase() }
            .distinct()

    println(distinctLetters)
}