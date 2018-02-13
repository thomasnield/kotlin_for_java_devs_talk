package org.nield.ex2_variables

fun main(args: Array<String>) {

    var x = 10
    var y = 23

    var sum = x + y

    println(sum)

    y = 10        // okay
    sum = x + y   // okay

    println(sum)
}