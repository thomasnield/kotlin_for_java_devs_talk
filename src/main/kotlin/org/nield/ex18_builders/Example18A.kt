package org.nield.ex18_builders

fun main(args: Array<String>) {

    val myHotel = hotel {

        rooms {
            queen(quantity = 60)
            doublequeen(quantity = 60)

            king(quantity = 20)
            doubleking(quantity = 20)
        }

        prices {
            price(daysBeforeStay = 0..4, priceRange = 170.01..200.00)
            price(daysBeforeStay = 5..10, priceRange = 150.01..170.00)
            price(daysBeforeStay = 11..20, priceRange = 110.01..150.00)
            price(daysBeforeStay = 21..60, priceRange = 75.00..110.00)
        }
    }

    myHotel.executeOptimization()


}