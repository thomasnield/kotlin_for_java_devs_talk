package org.nield.ex10_delegates

import java.net.URL


val usStates by lazy {
    println("property called, loading and caching!")
    URL("https://goo.gl/S0xuOi").readText().split(Regex("\\r?\\n"))
}

fun main(args: Array<String>) {

    println("Application started without loading U.S. states")
    println(usStates) //usStates will load now that its called
}
