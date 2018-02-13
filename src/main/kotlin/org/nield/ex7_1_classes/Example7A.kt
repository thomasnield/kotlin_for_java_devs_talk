package org.nield.ex7_1_classes

import java.time.LocalDate

fun main(args: Array<String>) {

    val firstPatient = Patient("Elena", "Patterson", LocalDate.of(1985, 1, 4))
    println("First patient is ${firstPatient.firstName} ${firstPatient.lastName}")

    val secondPatient = Patient(firstName="John", lastName="Payne", birthday=LocalDate.of(1981, 6, 11))
    println("Second patient is ${secondPatient.firstName} ${secondPatient.lastName}")
}

class Patient(val firstName: String, val lastName: String, val birthday: LocalDate)