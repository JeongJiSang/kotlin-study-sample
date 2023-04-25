package study6

data class Car(val name: String, val speed:Int){

}

fun main() {
    var car = Car("카1", 200)

    println(car.name)
    println(car.speed)
    println(car.component1())
    println(car.component2())
}