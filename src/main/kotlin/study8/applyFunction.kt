package study8

/**
 * run함수와 사용 목적이 같다. 하지만 리턴 값이 다르다.
 */
class Student2 {
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
    val student = Student2()
    student.name = "홍길동"
    student.age = 34
    student.speak()
    student.getInfo()

    val student2 = student.apply {
        name = "고길동"
        age = 43
        speak()
        getInfo()
    }
    println("student name: ${student.name}, student2 name: ${student2.name}")

    student.name = "정지상"
    println("student name: ${student.name}, student2 name: ${student2.name}")
}