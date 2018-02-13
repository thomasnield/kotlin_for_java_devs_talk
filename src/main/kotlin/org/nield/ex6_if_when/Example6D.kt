package org.nield.ex6_if_when


fun main(args: Array<String>) {

    val distance = 150

    val haulType = if (distance > 200) "LONG HAUL" else "SHORT HAUL"

    println("$distance is a $haulType")
}