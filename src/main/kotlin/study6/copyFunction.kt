package study6

/**
 * 데이터 클래스에서 제공하는 copy()함수 : 객체를 복사해서 다른 객체를 만들어주는 함수
 * 일부분의 데이터만 변경 후 다른 객체를 만들 때 유용하게 사용 가능
 */

data class Product(val name:String, val price:Int)

fun main() {
    var prod = Product(price = 10000, name = "상품1")
    println(prod.toString())

    var prod2 = prod.copy(name = "상품2")
    println(prod2.toString())
}