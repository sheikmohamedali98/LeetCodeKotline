package Number

import kotlin.math.abs

class `Pow(x,n)` {
    fun myPow(x: Double, n: Int): Double {
        var num = n
        if (n < 0) {
            num = abs(n)
        }
        var answer = 1.0
        for (i in 0 until num) {
            answer *= x
        }

        if (n < 0) {
            answer = 1 / answer
        }
        return answer
    }


    fun myPow1(x: Double, n: Int): Double {
        val num: Double = if (n < 0) 1/x else x
        println("num $num")
        var power: Long = Math.abs(n.toLong())
        var product: Double = num
        var res: Double = 1.0
        while (power > 0) {
            if (power%2 == 1L) {
                res *= product
                println("res $res")
            }
            power /= 2
            product *= product
        }
        return res
    }
}

fun main() {
    val pow = `Pow(x,n)`()
    println(pow.myPow(3.00000, -2))

    println(pow.myPow1(3.0,-2))
}