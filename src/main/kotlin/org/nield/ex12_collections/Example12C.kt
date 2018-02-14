package org.nield.ex12_collections


fun main(args: Array<String>) {

    val strings = mutableListOf("Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot")

    strings[3] = "Whiskey"

    strings += "Tango" //append Tango
    strings -= "Alpha" //remove Alpha

    println(strings)
}