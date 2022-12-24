package String

import java.util.Stack

class RemoveAllAdjacentDuplicatesInString {
        fun removeDuplicates(s: String):String {
            val stack = Stack<Char>()
            var string = ""
            for(index in 0 until  s.length){
                if(!stack.empty()&&stack.peek() == s.get(index)){
                    stack.pop()
                }else{
                    stack.push(s.get(index))
                }
            }
            for(index in 0 until stack.size) {
                 string += stack.pop()
            }

            return string.reversed()
        }
}
fun main(){
    val removeAllAdjacentDuplicatesInString  = RemoveAllAdjacentDuplicatesInString()
    println(removeAllAdjacentDuplicatesInString.removeDuplicates("azxxzy"))
}