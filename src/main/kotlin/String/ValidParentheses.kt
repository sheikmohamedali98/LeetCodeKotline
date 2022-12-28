package String

import java.util.Stack

class ValidParentheses {
    private  val map = mapOf<Char,Char>('(' to ')','{' to '}','[' to ']')
    fun isValid(s: String): Boolean {
        var s = s
        var len = 0
        do {
            len = s.length
            s = s.replace("()","").replace("[]","").replace("{}","")

        }while (len!=s.length)

        return s.length == 0
    }

    fun validateParentheses(string: String):Boolean{

        val stack = Stack<Char>()

        for(ch in string.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch)
            }else if (stack.isEmpty()||map.get(stack.pop())!=ch){

                return false
            }
        }
        return stack.isEmpty()
    }

}
fun main(){
    val validParentheses = ValidParentheses()
    println(validParentheses.isValid("({[)"))
    println(validParentheses.validateParentheses("({[)"))
}