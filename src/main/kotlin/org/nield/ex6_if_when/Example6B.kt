package org.nield.ex6_if_when

fun main(args: Array<String>) {

    val speedLimit = 65
    val currentSpeed = 40

    if (currentSpeed > speedLimit)
        println("Exceeding speed limit!")
    else
        println("Speed is okay!")
}