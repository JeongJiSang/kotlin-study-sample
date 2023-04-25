package study8

class Person() {
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age:Int) : this() {
        this.name = name
        this.age = age
    }

}

fun letFunc(person: Person){
    println("letFunc() : ${person.name }, ${person.age}")
}

fun main(args: Array<String>) :Unit{

    val a = 100
    val b = 50

    (a*b - 40*a).run {
        if (this > 0) {
            println(this)
        }
    }

    (a*b - 40*a).let {
        if(it > 0){
            println(it)
        }
    }

    //자신을 호출한 객체를 람다함수의 매개변수로 전달하는 함수
    (a*b - 40*a).let {result:Int ->
        if(result > 0) println(result)
    }

    val person = Person("홍길동", 25)
    letFunc(person)

    Person("정지상", 26).let { person ->
        letFunc(person)
    }

    Person("정지상", 26).let {
        letFunc(it)
    }
}