package org.nield.ex8_3_data_classes

import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {

    val patient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))

    val modifiedPatient = patient.copy(lastName = "Connors")

    println(patient)
    println(modifiedPatient)
}

data class Patient(val firstName: String, val lastName: String, val birthday: LocalDate) {

    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())
}