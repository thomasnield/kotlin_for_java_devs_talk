package org.nield.ex6_if_when


fun main(args: Array<String>) {

    // solicit wind speed input
    println("Input a wind speed")
    val windSpeed = readLine()?.toInt()?: throw Exception("Please provide a wind speed!")

    // evaluate wind speed category
    val windSeverity = when {
        windSpeed >= 40 -> "HIGH"
        windSpeed >= 30 -> "MODERATE"
        windSpeed >= 0 -> "LOW"
        else -> throw Exception("Wind speed must be positive!")
    }

    println("$windSpeed MPH has a severity of $windSeverity")
}