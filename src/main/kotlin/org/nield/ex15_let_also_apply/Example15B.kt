package org.nield.ex15_let_also_apply

fun main(args: Array<String>) {

    val myString = "Bravo"

    val uppercased = myString.toUpperCase()

    val mirrored  = uppercased + "|" + uppercased.reversed()

    println(mirrored)
}

// val mirrored = myString.toUpperCase().let { it + "|" + it.reversed() }