package String

import java.util.Stack

class ImplementQueueusingStacks {
    val stack1 = Stack<Int>()
    val stack2 = Stack<Int>()

    fun push(x: Int) {
        stack1.push(x)
    }

    fun pop(): Int {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return  stack2.pop()

    }

    fun peek(): Int {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
        }
        return stack2.peek()
    }

    fun empty(): Boolean {

        return stack1.isEmpty()&&stack2.isEmpty()
    }
}

fun main(){
    val obj = ImplementQueueusingStacks()
    obj.push(1)
    obj.push(2)
    println(obj.peek())
    println(obj.pop())
    println(obj.empty())
}