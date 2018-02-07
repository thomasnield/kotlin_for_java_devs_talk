package org.nield.ex3

import java.math.BigDecimal

fun main(args: Array<String>) {

    val balance = BigDecimal.valueOf(1808.2)
    println("BALANCE: $balance")

    val transactionAmount = BigDecimal.valueOf(56.12)
    println("NEW BALANCE: ${balance - transactionAmount}")
}