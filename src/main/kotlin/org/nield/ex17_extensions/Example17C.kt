package org.nield.ex17_extensions

import java.time.DayOfWeek
import java.time.LocalDate

fun main(args: Array<String>) {

    val myDate = LocalDate.of(2017,8,31)

    val weekStartDate = myDate.startOfWeek

    println(weekStartDate)
}

val LocalDate.startOfWeek get() = (0..6).asSequence()
        .map { this.minusDays(it.toLong()) }
        .first { it.dayOfWeek == DayOfWeek.MONDAY }