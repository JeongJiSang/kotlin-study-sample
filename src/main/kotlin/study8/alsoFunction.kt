package study8

class Employee {
    var name : String = ""
    var age : Int = 0
    var salary : Int = 0

    override fun toString() = "$name $age $salary"

}

fun main() {

    println(Employee().also {
        it.name = "김지지"
        it.age = 43
        it.salary = 3000000
        it.toString()
    })


    val employee = Employee()
    employee.name = "홍길동"
    employee.age = 33
    employee.salary = 4000000


    val employee2 = employee.also {
        it.name = "강길동"
        it.age = 29
        it.salary = 4000000
    }

    println(employee.toString())
    println(employee2.toString())
}