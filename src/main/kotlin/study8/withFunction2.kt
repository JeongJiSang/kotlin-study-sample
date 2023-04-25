package study8

class Product {
    var name: String? = null
    var price: Int? = null

    fun getInfo() {
        println("productName: ${name}, price: ${price}")
    }

}

fun main() {
    val product = Product()
    product.name = "컴퓨터"
    product.price = 800000
    product.getInfo()

    product.run {
        name = "모니터"
        price = 500000
        getInfo()
    }

    with(product) {
        name = "책상"
        price = 300000
        getInfo()
    }
}