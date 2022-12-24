package Array

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var array:IntArray = IntArray(2)
        val length = nums.size
        var i=0
        var j =1
        while (i<length&&j<length){
            if(nums[i]+nums[j] == target){
                array[0] = i
                array[1] = j
                break
            }
            i++
            j++
        }

        return array

    }
    fun twoSumMap(nums: IntArray, target: Int): IntArray {
        var array:IntArray = IntArray(2)
        val length = nums.size
        val map:MutableMap<Int,Int> = mutableMapOf()

        for(i in 0 until length){
            if(map.containsKey(target-nums[i])){
                array[1] = i
                array[0] = map.get(target-nums[i])!!
            }
            map.put(nums[i],i)
        }


        return array

    }

//    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
//        val length = matrix.size
//    }
}
fun main(){
    val twoSum = TwoSum()
    val intArray = intArrayOf(3,2,3)
println(twoSum.twoSumMap(intArray,6).contentToString())
//    println(twoSum.twoSum(intArray,6).contentToString())

    println((-121).toString().reversed().toInt())
}