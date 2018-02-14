package org.nield.ex17_extensions

import java.time.LocalDate

fun main(args: Array<String>) {

    val myDate = LocalDate.of(2017,8,31)

    val tomorrow = myDate + 1

    println(tomorrow)
}

operator fun LocalDate.plus(days: Int) = plusDays(days.toLong())
operator fun LocalDate.minus(days: Int) = minusDays(days.toLong())