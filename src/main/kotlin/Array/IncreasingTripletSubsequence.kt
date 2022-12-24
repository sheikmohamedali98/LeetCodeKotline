package Array

/*

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 */
class IncreasingTripletSubsequence {

    fun increasingTriplet(nums: IntArray): Boolean {

//        for(i in 0 until nums.size){
//
//        }

        var right = 0
        var left  = 1
        var count = 0

        while(right<nums.size && left<nums.size){

            if(nums[right]<nums[left]){
                left++
                count++
            }else{
                right++
                left = right+1
            }

        }

        return count>=3

    }
}


fun main(){
    val increasingTripletSubsequence = IncreasingTripletSubsequence()
    var intArray = intArrayOf(5,4,3,2,1)

    print("${increasingTripletSubsequence.increasingTriplet(intArray)}")
}