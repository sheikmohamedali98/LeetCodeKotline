package String

import java.util.*

class LongestCommonPrefix {

    fun longestCommonPrefix(strings: Array<String>): String {
        if(strings.size ==0 || strings == null){
            return ""
        }
        Arrays.sort(strings)

        var count = 0
        val stringFirst  = strings[0]
        val stringLast = strings[strings.size-1]

        while (count<stringFirst.length){
            if(stringFirst.get(count) == stringLast.get(count)){
                count++
            }else{
                break
            }
        }

       return if (count == 0) " " else stringFirst.subSequence(0, count).toString()


    }
}
fun  main(){
    val strings = arrayOf("dog","racecar","car")
    val longestCommonPrefix = LongestCommonPrefix()
   println( longestCommonPrefix.longestCommonPrefix(strings))
}