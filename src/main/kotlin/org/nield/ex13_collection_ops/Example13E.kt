package org.nield.ex13_collection_ops

fun main(args: Array<String>) {

    val strings = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    val distinctLetters = strings.asSequence()
            .flatMap { it.split("").asSequence() }
            .filter { it.trim() != "" }
            .map { it.toUpperCase() }
            .toSet()

    println(distinctLetters)
}