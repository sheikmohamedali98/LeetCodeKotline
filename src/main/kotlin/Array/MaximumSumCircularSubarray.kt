package Array

class MaximumSumCircularSubarray {

    fun maxSubarraySumCircular(nums: IntArray): Int {

        var left = 0
        val right = nums.size - 1
        var sum = Int.MIN_VALUE
        while (left <= right) {
            val star = left
            val list = mutableListOf<Int>()
            for (i in star until nums.size) {
                list.add(nums[i])
                sum = maxOf(sum, findMax(list))
            }
            left++
        }
        val last = nums[0]+nums[nums.size-1]
        sum = maxOf(sum,last)
        return sum
    }

    fun findMax(list: List<Int>): Int {
        var nums = 0
        for (i in 0 until list.size) {
            nums += list[i]
        }
        return nums
    }
}

fun main() {
    val maximumSumCircularSubarray = MaximumSumCircularSubarray()
    val array = intArrayOf(1,-2,3,-2)
    println(maximumSumCircularSubarray.maxSubarraySumCircular(array))

}