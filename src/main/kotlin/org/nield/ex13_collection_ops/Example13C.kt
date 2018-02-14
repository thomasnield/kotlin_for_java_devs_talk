package org.nield.ex13_collection_ops


fun main(args: Array<String>) {

    val strings = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    val filteredStrings = strings.filter { it.length > 5 }

    filteredStrings.forEach { println(it) }
}