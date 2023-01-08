package Number

import kotlin.math.pow

class PlusOne {
    fun plusOne1(digits: IntArray){

        println("array ${digits.contentToString()}")
        var num:Double = 0.0
        println("size ${digits.size}")
        var number =digits.size-1
        var intArray = doubleArrayOf()

        for(index in 0 until  digits.size){
            println( (digits[index]*10.0.pow(number)))
            num += digits[index]* 10.0.pow(number)
            number--
        }
        println(num)
        num+=1

        val list = mutableListOf<Double>()

        while(num>0){
            var remider  = num%10
            list.add(remider.toDouble())
            num /= 10
        }
        intArray =  list.toDoubleArray()
        println(intArray.contentToString())
    }


    fun plusOne(digits: IntArray): IntArray {

        for(i in digits.size - 1 downTo 0) {
            digits[i]+=1

            if(digits[i]<=9)
                return digits
            digits[i]=0
        }
        var arr = IntArray(digits.size +1)
        arr[0] = 1
        return arr
    }
}

fun main(){
    val plusOne = PlusOne()
    val digits = intArrayOf(9,9,9)
   println( plusOne.plusOne(digits).contentToString())
}
