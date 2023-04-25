package study7

/**
 * 클래스 안에 클래스를 선언하는 중첩 클래스
 */

class Outer{

    var num: Int = 100
    fun outerFun(){
        println("outerFun!")
    }

    class Nested{
        fun greeting(){
            println("안녕하세요")
//            num = 200
        }

        fun info() = println("정보")
    }

    inner class Nested2{
        val name:String = "홍길동"

        fun printName(){
            println("Nested2 fun")
            num = 200
        }
    }
}

fun main() {
    val obj:Outer.Nested = Outer.Nested()
    obj.greeting()

    val obj2: Outer.Nested2 = Outer().Nested2()
    println(obj2.name)
    obj2.printName()
    println(obj2.name)
}