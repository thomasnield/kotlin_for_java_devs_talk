package org.nield.ex14_map_and_companion

import java.time.LocalDate

fun main(args: Array<String>) {

    data class Patient(val firstName: String,
                       val lastName: String,
                       val birthday: LocalDate,
                       val whiteBloodCellCount: Int)

    data class NameKey(val firstName: String, val lastName: String)

    val patients = listOf(
            Patient("John", "Simone", LocalDate.of(1989, 1, 7), 4500),
            Patient("Sarah", "Marley", LocalDate.of(1970, 2, 5), 6700),
            Patient("Jessica", "Arnold", LocalDate.of(1980, 3, 9), 3400),
            Patient("Sam", "Beasley", LocalDate.of(1981, 4, 17), 8800),
            Patient("Dan", "Forney", LocalDate.of(1985, 9, 13), 5400),
            Patient("Lauren", "Michaels", LocalDate.of(1975, 8, 21), 5000),
            Patient("Michael", "Erlich", LocalDate.of(1985, 12, 17), 4100),
            Patient("Jason", "Miles", LocalDate.of(1991, 11, 1), 3900),
            Patient("Rebekah", "Earley", LocalDate.of(1985, 2, 18), 4600),
            Patient("James", "Larson", LocalDate.of(1974, 4, 10), 5100),
            Patient("Dan", "Ulrech",  LocalDate.of(1991, 7, 11), 6000),
            Patient("Heather", "Eisner", LocalDate.of(1994, 3, 6), 6000),
            Patient("Jasper", "Martin", LocalDate.of(1971, 7, 1), 6000)
    )

    val mappedByName = patients.map {
        NameKey(it.firstName, it.lastName) to it
    }.toMap()

    val retrievedPatient = mappedByName[NameKey("John", "Simone")]
    println(retrievedPatient)
}