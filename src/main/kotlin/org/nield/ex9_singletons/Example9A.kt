package org.nield.ex9_singletons


fun main(args: Array<String>) {

    ModelArguments.minimumAccuracy = .20
    ModelArguments.targetAccuracy = .60

    val correctPredictions = 205
    val totalPredictions =  500

    val accuracy = correctPredictions.toDouble() / totalPredictions.toDouble()

    println(ModelArguments.meetsTarget(accuracy))
}

object ModelArguments {
    var minimumAccuracy = 0.0
    var targetAccuracy = 0.0

    fun meetsTarget(accuracy: Double) = accuracy >= targetAccuracy
    fun meetsMinimum(accuracy: Double) = accuracy >= minimumAccuracy
}