package org.nield.ex16_lambdas


fun main(args: Array<String>) {

    val str1 = "Alpha"
    val str2 = "Beta"

    val combineMethod1 = combineStrings(str1, str2) { s1, s2 -> s1 + s2 }
    println(combineMethod1)

    val combineMethod2 = combineStrings(str1, str2) { s1, s2 -> "$s1-$s2"}
    println(combineMethod2)
}

fun combineStrings(str1: String, str2: String, combiner: (String,String) -> String) = combiner(str1, str2)