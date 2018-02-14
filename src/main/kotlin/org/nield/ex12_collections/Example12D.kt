package org.nield.ex12_collections

fun main(args: Array<String>) {

    val strings = mutableSetOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    strings += "Alpha"

    println(strings)
}