package org.nield.ex10_delegates

import tornadofx.*


var assignMe: Int by singleAssign()


fun main(args: Array<String>) {

    assignMe = 12
    println(assignMe)

    assignMe = 10 // error!
}