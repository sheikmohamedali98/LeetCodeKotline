package Number

class IntegerToRoman {

    val stringArray = arrayOf("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M")
    val intArray = intArrayOf(1,4,5,9,10,40,50,90,100,400,500,900,1000)
    fun intToRoman(num: Int): String {
        var number = num
        var str:String = ""

        var size = intArray.size-1
        while (number>0&& size>=0){
            if(number<intArray[size]){
                size--
            }else{
                number -= intArray[size]
                str += stringArray[size]
            }

        }
        return  str
    }
//    fun value(n:Int): String? {
//        var ans =   when(n){
//            1->"I"
//            5->"V"
//            10->"X"
//            50->"L"
//            100->"C"
//            500->"D"
//            1000->"M"
//            else -> {null}
//        }
//        return  ans;
//    }
}

fun main(){
    val integerToRoman:IntegerToRoman = IntegerToRoman()
   var roman = integerToRoman.intToRoman(58)
    println("$roman")
}