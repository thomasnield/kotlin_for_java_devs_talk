package org.nield.ex14_map_and_companion

fun main(args: Array<String>) {

    val retreivedPatient = Patient.forId(3)

    print(retreivedPatient)
}

data class Patient(val id: Int,
                   val firstName: String,
                   val lastName: String) {

    companion object {

        val allPatients = listOf(
                Patient(1, "John", "Mooney"),
                Patient(2, "Sam", "Bella"),
                Patient(3, "Jake", "Blaine"),
                Patient(4, "Hannah", "Smith"),
                Patient(5, "John", "Mooney")
        )

        fun forId(id: Int) = allPatients.find { it.id == id }
    }
}