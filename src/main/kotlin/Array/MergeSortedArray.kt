package Array

import java.util.*
/*

[-1,0,0,3,3,3,0,0,0]
6
[1,2,2]
3
 */
class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val length = m+n
        var len = 0
        for(i in 0 until length){
            if(nums1[i] ==0&&len<=n){
                nums1[i] = nums2[len++]
            }
        }

        nums1.sort()

        println("${Arrays.toString(nums1)}")

    }
}

fun main(){

}