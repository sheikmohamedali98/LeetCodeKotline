package Array

class HowManyNumbersAreSmallerThantheCurrentNumber {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size)

        var count = 0
        for( i in 0 until nums.size){
            for (j in 0 until nums.size){
                if(nums[i]>nums[j]){
                    count++
                }
            }
            resultArray[i] = count
            count = 0
        }

        return resultArray
    }
}
fun main(){
    val howManyNumbersAreSmallerThantheCurrentNumber = HowManyNumbersAreSmallerThantheCurrentNumber()
    println(howManyNumbersAreSmallerThantheCurrentNumber.smallerNumbersThanCurrent(intArrayOf(7,7,7,7)).contentToString())
}