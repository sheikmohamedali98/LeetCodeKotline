package String

import java.util.*

class ReverseWordsinAString {
    fun reverseWords(s: String) {

        var string = ""
        val stringArray = s.trim().split("\\s+".toRegex())
        for(index in stringArray.size-1 downTo 0){
            string += stringArray[index]+" "
        }
        println(string.trim())
    }
}
fun  main(){
    val reverseWordsinAString = ReverseWordsinAString()
    reverseWordsinAString.reverseWords("a good   example")
}