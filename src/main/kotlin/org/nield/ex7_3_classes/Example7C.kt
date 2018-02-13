package org.nield.ex7_3_classes


import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {

    val patient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))

    println("${patient.firstName}'s age is ${patient.age}")
}

class Patient(val firstName: String, val lastName: String, val birthday: LocalDate) {

    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())
}