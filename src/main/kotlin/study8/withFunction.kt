package study8

/**
 * with 함수 : run 함수와 사용 목적이 같다
 */
class withFunction {


}

fun main(args: Array<String>) :Unit{
    val a = 3
    val b = 7

    (a*b - b*b).run {
        println(this)
        println(-this)
    }

    with(a*b - b*b){
        println(this)
        println(-this)
    }
}