package study8

/**
 * 람다함수를 실행하고 그 결과를 바로 얻기 위한 목적으로 사용하는 경우
 * inline fun <R> run(block: () -> R) : R
 *
 * 객체의 멤버에 접근하기 위해서 사용하는 경우 - 객체의 여러 멤버(함수, 변수)에 접근할 때에도 유용하게 사용할 수 있다.
 * inline fun <T, R> T.run(block: T.() -> R) : R
 */
class Student{
    var name: String? = null
    var age: Int? = null

    fun speak(){
        print("hi $name. ")
    }

    fun getInfo() {
        println("이름 : ${name}, 나이: ${age}")
    }
}

fun main() {
    val result = run {
        println("람다 함수 호출")
        10*10
    }
    println("result: $result")

    val student = Student()
    student.name = "홍길동"
    student.age = 24
    student.speak()
    student.getInfo()

    val runStudent = student.run {
        name = "홍길순"
        age = 28
        speak()
        getInfo()
        1
    }

    println("runStudent: $runStudent")
}