package Number

class Maximum69Number {
    fun maximum69Number (num: Int): Int {
        var pointer = -1
        var digitCount = 0
        var temp = num

        while (temp>0){

            val digit = temp%10
            if(digit == 6){
                pointer = digitCount
            }
            digitCount++
            temp = temp/10
        }

        if(pointer ==-1){
            return  num
        }

        val ans = num + 3*Math.pow(10.0,pointer.toDouble()).toInt()

        return ans
    }
}

fun main(){
    val maximum69Number = Maximum69Number()

    println(maximum69Number.maximum69Number(9669))
}

//var number = 0
//var max = num
//val str:String = num.toString()
//for(i in 0 until str.length){
//    val array =  str.toCharArray()
//    if(array[i] == '9'|| array[array.size-1] != '9'){
//        array[i] = array[i]-3
//    }else if(array[i] == '6'){
//        array[i] = array[i]+3
//    }
//    val ans = String(array)
//    number = ans.toInt()
//    println(number)
//    if(max<= number){
//        break
//    }
//
//}
//return number