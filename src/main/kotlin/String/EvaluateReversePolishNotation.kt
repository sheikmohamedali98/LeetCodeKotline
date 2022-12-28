package String

import java.util.*

class EvaluateReversePolishNotation {
    private lateinit var stack: Stack<Int>

    fun evalRPN(tokens: Array<String>): Int {
        stack = Stack<Int>()

        for (token in tokens) {
            if (isNumeric(token)) {
                stack.push(token.toInt())
                continue
            }

            val op2 = stack.pop()
            val op1 = stack.pop()

            val res = when (token) {
                "+" -> op1 + op2
                "-" -> op1 - op2
                "/" -> op1 / op2
                "*" -> op1 * op2
                else -> throw RuntimeException()
            }

            stack.push(res)
        }

        return stack.pop()
    }

    fun isNumeric(token: String): Boolean = token.toIntOrNull() != null
}
fun main(){
    val evaluateReversePolishNotation = EvaluateReversePolishNotation()
    println(evaluateReversePolishNotation.evalRPN(arrayOf("3","-4","+")))
}