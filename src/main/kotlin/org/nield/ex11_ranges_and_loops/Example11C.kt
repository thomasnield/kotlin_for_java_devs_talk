package org.nield.ex11_ranges_and_loops

import java.time.LocalDate

fun main(args: Array<String>) {

    val dateRange = LocalDate.of(2017,3,1)..LocalDate.of(2017,6,1)

    /*
    for (dt in dateRange) { // error, not supported
        println(dt)
    }
    */
}