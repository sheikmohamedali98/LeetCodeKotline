package String

import java.util.*

class ZigzagConversion {

    fun convert(s: String, numRows: Int) {
        var string:Array<String> = Array<String>(numRows){""}

        var count = 0
        var flag:Boolean = true

        for(i in 0 until  s.length){

            if(flag){
                string[count++] += s.get(i).toString()
                if(count<numRows-1){
                    flag = false
                }
            }else{
                string[count--] += s.get(i).toString()
                if(count ==0 ){
                    flag = true
                }
            }
        }


println(Arrays.toString(string))

    }
}

fun main(){
    val zigzagConversion = ZigzagConversion()
    zigzagConversion.convert("PAYPALISHIRIN",4)
}