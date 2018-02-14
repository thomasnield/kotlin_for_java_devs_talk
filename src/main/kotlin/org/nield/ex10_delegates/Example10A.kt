package org.nield.ex10_delegates


fun main(args: Array<String>) {


    val alpha = object: Alpha {
        override val a = 1

        override fun doSomething()  = println("Hello")
    }

    val beta = object: Beta {
        override val b = 2

        override fun doSomethingElse() = println("World")
    }

    val alphaBeta = AlphaBeta(alpha, beta)

}

class AlphaBeta(val alpha: Alpha, val beta: Beta): Alpha by alpha, Beta by beta



interface Alpha {
    val a: Int

    fun doSomething(): Unit
}

interface Beta {
    val b: Int

    fun doSomethingElse(): Unit
}