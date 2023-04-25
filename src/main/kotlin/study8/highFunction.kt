package study8

/**
 * 고차함수에서 매개변수와 리턴 값에 람다함수를 많이 사용한다.
 * 람다함수 이외에도 함수 참조나 익명 함수를 이용할 수 도 있다.
 * 함수 참조 연산자 :: 를 이용
 *
 * 함수 형식
 * 일반 함수
 * 익명 함수
 * 람다 함수
 */

fun main() {

    fun cc(funParam: (x:Int) -> Int){
        println("${funParam(100)}")
    }

    cc{it * 100} //람다 함수 이용

    //함수 참조를 이용한 고차함수 호출
    fun ccFun(x:Int):Int{
        return x * 100
    }

    cc(::ccFun) //함수 참조를 이용


    /**
     * 람다함수를 이용한 함수 전달
     */
    val lamdaFunc = { x:Int ->
        println("람다 함수")
        x * 100
//        return 람다 함수에서는 return을 사용할 수 없다.
//        반환 타입을 명시할 수 없다.
    }
    println(lamdaFunc(5))


    /**
     * 익명함수를 이용한 함수 전달
     */
    val anonyFunc = fun(a: Int): Int = a * 100

    val anonyFunc2 = fun(a: Int): Int {
        println("익명함수")
        return a * 100
    }

    println(anonyFunc2(3))
    println(anonyFunc(7))

    fun aa(a:(Int) -> Int){
        println("${a(100)}")
    }

    aa(fun(x:Int):Int = x * 5)
}

