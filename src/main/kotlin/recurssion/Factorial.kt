package recurssion

class Factorial {

    fun findFactorial (number:Int):Int{
        if(number == 1){
            return number
        }
        return number*findFactorial(number-1)

    }
}

fun main(){
    val factorial = Factorial()

    println(factorial.findFactorial(6))
}