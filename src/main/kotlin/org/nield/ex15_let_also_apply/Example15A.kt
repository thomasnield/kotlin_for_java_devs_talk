package org.nield.ex15_let_also_apply


import java.time.LocalDate

fun main(args: Array<String>) {


    val todaysDate = LocalDate.now().apply {

        //do stuff with LocalDate before assigning to todaysDate variable
        println("Constructed today's date, which is $month $dayOfMonth, $year")
    }


}