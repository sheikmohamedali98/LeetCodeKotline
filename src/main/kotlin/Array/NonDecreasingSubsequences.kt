package Array

class NonDecreasingSubsequences {

    //
    fun findSubsequences(nums: IntArray): List<List<Int>> {
        val set = mutableSetOf<MutableList<Int>>()

        var start = 0
        var second = 1
        while (start<nums.size&&second<nums.size) {
            val list = mutableListOf<Int>()

            for(index in start ..  second){
                    list.add(nums[index])
            }
            second++
            if(list.size>=2) {
                set.addAll(listOf(list))
            }
            if(second == nums.size){
                start++
                second = start+1
            }
        }
        println(set)
        return set.toList()
    }
}

fun main() {
    val nonDecreasingSubsequences = NonDecreasingSubsequences()
    val array = intArrayOf(4,6,7,7)
    println(nonDecreasingSubsequences.findSubsequences(array))

}