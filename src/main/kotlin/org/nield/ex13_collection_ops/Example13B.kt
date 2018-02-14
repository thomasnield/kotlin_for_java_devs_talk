package org.nield.ex13_collection_ops

fun main(args: Array<String>) {

    val strings = listOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    val lengths = strings.map { it.length }

    lengths.forEach { println(it) }
}