package Array

class LongestSubsequenceWithLimitedSum {
    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        val  resultArray = IntArray(queries.size)
        var j = 0
        while (j!=queries.size){
            var sum = 0
            var count = 0
            for(i in 0 until nums.size){
                if(sum+nums[i]<=queries[j]){
                    sum += nums[i]
                    count++
                }
            }
            resultArray[j] = count
            j++
        }
return resultArray
    }

}

fun main(){
    val longestSubsequenceWithLimitedSum =LongestSubsequenceWithLimitedSum()
    println(longestSubsequenceWithLimitedSum.answerQueries(intArrayOf(4,5,2,1), intArrayOf(3,10,21)).contentToString())
}