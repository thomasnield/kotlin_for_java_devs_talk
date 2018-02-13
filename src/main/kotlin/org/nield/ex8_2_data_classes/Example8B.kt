package org.nield.ex8_2_data_classes


import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main(args: Array<String>) {

    val firstPatient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    val secondPatient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    val thirdPatient = Patient("Alex", "Johnson", LocalDate.of(1981, 3, 15))

    if (firstPatient == secondPatient)
        println("firstPatient and secondPatient are duplicates!")

    if (firstPatient != thirdPatient)
        println("firstPatient and thirdPatient are not duplicates!")

}

data class Patient(val firstName: String, val lastName: String, val birthday: LocalDate) {

    val age get() = ChronoUnit.YEARS.between(birthday, LocalDate.now())
}