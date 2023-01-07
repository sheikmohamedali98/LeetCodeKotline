package Array

import java.util.Stack

class MaximizeTheTopmostElementAfterKMoves {


    fun maximumTop(nums: IntArray, k: Int): Int {
        var max = 0
        if(nums.size == 1&& k == 1){
            return -1
        }

        val stack = Stack<Int>()
        nums.reverse()
        for(index in 0 until  nums.size){
            stack.push(nums[index])
        }

        for(itration in 0 until  k){
            max = maxOf(max,stack.peek())
            if(itration == k-1){
                stack.push(max)
                break
            }
            if(max>=stack.peek()){
                stack.pop()
            }
        }
        println(stack)

        return stack.peek()
    }
}

//fun main(){
//    val maximizeTheTopmostElementAfterKMoves = MaximizeTheTopmostElementAfterKMoves()
//    val nums  = intArrayOf(5,2,2,4,0,6)
//    val k = 4
//   println( maximizeTheTopmostElementAfterKMoves.maximumTop(nums, k))
//}