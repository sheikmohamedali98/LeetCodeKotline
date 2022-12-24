package Array

import java.util.Stack

class FindNextGreaterElement {
    fun findNearMax(intArray:IntArray){

        for(i in 0 until intArray.size){
            var num = -1
            for(j in i+1 until  intArray.size){
                if(intArray[i]<intArray[j]){
                    num = intArray[j]
                    break
                }
            }
            println(" ${intArray[i]}->${num}")
        }

    }

    fun findNextLargeStack(intArray: IntArray){
        val stack = Stack<Int>()
        stack.push(intArray[0])
//        println(stack)
        for(i in 1 until  intArray.size){
            if(intArray[i]>stack.peek()){
                println(stack)
                println("${stack.pop()}->${intArray[i]}")
                stack.push(intArray[i])
            }else{
                stack.push(intArray[i])
            }
        }
        println(stack)
    }


}
fun main(){
    val findNextGreaterElement = FindNextGreaterElement()
    val intArray = intArrayOf(4,2,6,8,1)
    findNextGreaterElement.findNearMax(intArray)
    println()
    findNextGreaterElement.findNextLargeStack(intArray)
}