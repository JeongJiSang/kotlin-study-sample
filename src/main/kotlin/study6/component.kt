package study6

/**
 * 데이터 분해선언(Destructuring Declarations)
 */

data class Flower(val name: String, val price: Int)

fun main() {
    val flower = Flower(price = 2000, name = "장미")
    val (name, price) = flower // 데이터 분해 선언

    println("name: $name, price: $price")
}