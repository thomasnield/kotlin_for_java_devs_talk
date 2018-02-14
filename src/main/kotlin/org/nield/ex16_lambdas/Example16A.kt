package org.nield.ex16_lambdas

fun main(args: Array<String>) {
    val myString = "Foxtrot"

    val length = mapStringToInt(myString) { it.length }

    println(length)
}

inline fun mapStringToInt(input: String, crossinline mapper: (String) -> Int) = mapper(input)


/*

val length = mapStringToInt(myString) { it.length }
val length = mapStringToInt(myString) { s -> s.length }
val length = mapStringToInt(myString) { s: String -> s.length }
val length = mapStringToInt(myString, String::length))


 */