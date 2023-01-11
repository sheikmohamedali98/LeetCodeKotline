package Array

class FindFirstAndLastPositionOfElementInSortedArray {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1
        var answer = intArrayOf(-1, -1)

        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                answer[0] = left
                answer[1] = right
                break
            }
            if (nums[left] != target) {
                left++
            }
            if (nums[right] != target) {
                right--
            }
        }

        return answer
    }
}

fun main() {
    val nums = intArrayOf()
    val target = 0
    val findFirstAndLastPositionOfElementInSortedArray = FindFirstAndLastPositionOfElementInSortedArray()
    println(findFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target).contentToString())
}