package org.nield.ex18_builders

import java.math.BigDecimal

fun hotel(op: HotelBuilder.() -> Unit): HotelBuilder {
    val newHotelModel = HotelBuilder()

    newHotelModel.op()

    return newHotelModel
}


class HotelBuilder {

    private val availableRooms = mutableListOf<Room>()
    private val availablePrices = mutableListOf<Price>()

    fun rooms(op: RoomBuilder.() -> Unit) {
        val builder = RoomBuilder()
        builder.op()
        availableRooms += builder.roomQueue
    }

    fun prices(op: PriceBuilder.() -> Unit) {
        val builder = PriceBuilder()
        builder.op()
        availablePrices += builder.prices
    }

    fun executeOptimization() {
        println("Input contains ${availableRooms.size} rooms and ${availablePrices.size} price ranges.")
        println("Executing optimization operations...")
    }
}

class Room(val bedType: BedType, val isDouble: Boolean = false)

class Price(val daysBeforeStayRange: IntRange, val priceRange: ClosedRange<BigDecimal>)

enum class BedType {
    KING,
    QUEEN
}

class RoomBuilder {
    val roomQueue = mutableListOf<Room>()

    fun queen(quantity: Int) = add(BedType.QUEEN, quantity, false)
    fun king(quantity: Int) = add(BedType.KING, quantity, false)
    fun doublequeen(quantity: Int) = add(BedType.QUEEN, quantity, true)
    fun doubleking(quantity: Int) = add(BedType.KING, quantity, true)

    fun add(bedType: BedType, quantity: Int, isDouble: Boolean)  =
            (1..quantity).asSequence()
                    .map { Room(bedType, isDouble) }
                    .forEach { roomQueue += it }
}

class PriceBuilder {
    val prices = mutableListOf<Price>()

    fun price(daysBeforeStay: IntRange, priceRange: ClosedRange<Double>) {
        prices += Price(
                daysBeforeStay,
                BigDecimal.valueOf(priceRange.start)..BigDecimal.valueOf(priceRange.endInclusive)
        )
    }
}