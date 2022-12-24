package Array

class RemoveDuplicatesfromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {

        val set:MutableSet<Int> = mutableSetOf()
        for (index in 0 until nums.size){
            set.add(nums[index])
        }

        return set.size
    }
    fun removeDuplicatesPrintArray(nums: IntArray) :Int{

        val set:MutableSet<Int> = mutableSetOf()
        var indexTemp = 0
        for (index in 0 until nums.size-1){
            if(nums[index]!= nums[index+1]){
                nums[indexTemp++] = nums[index]
            }
        }
        nums[indexTemp++] = nums[nums.size-1]

      return indexTemp


    }


}
fun main(){
    val  removeDuplicatesfromSortedArray =RemoveDuplicatesfromSortedArray()
    val intArray = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    println(removeDuplicatesfromSortedArray.removeDuplicates(intArray))

    println( removeDuplicatesfromSortedArray.removeDuplicatesPrintArray(intArray))
}