package String

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        var s = s
        var len = 0
        do {
            len = s.length
            s = s.replace("()","").replace("[]","").replace("{}","")

        }while (len!=s.length)

        return s.length == 0
    }

}
fun main(){
    val validParentheses = ValidParentheses()
    println(validParentheses.isValid("({[)"))
}