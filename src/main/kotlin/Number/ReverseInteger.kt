package Number

import kotlin.math.pow

class ReverseInteger {
    fun reverse(x: Int): Int {
        var num = x
        var flag  = false

        if(-2.0.pow(31) >= x && x>= 2.0.pow(31) - 1){
            return 0
        }
        if(x<0){
             num = Math.abs(x)
            flag = true
        }

        var int = 0
        while (num>0){
            var rem  = (num%10)
            int = (int*10) + rem
            num /=10

        }

        if(flag){
            int *= -1
        }
        return int
    }

    fun reverse1(x: Int): Int {
        var number = x
        var result = 0

        while (number != 0) {
            val push = result * 10
            // if value has changed after multiplication by 10
            // and division by 10, then there is a overflow
            if(push / 10 != result)
                return 0

            result = push + number % 10
            number /= 10
        }
        return result
    }
}

fun main(){
    val reverseInteger = ReverseInteger()
    println(reverseInteger.reverse(1534236469))
    println(reverseInteger.reverse1(1534236469))
}