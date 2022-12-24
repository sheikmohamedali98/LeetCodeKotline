package Array

class ContainsDuplicateII {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map:MutableMap<Int,Int> = HashMap()

        for(i in 0 until nums.size){
            var number:Int = nums[i]
//            if(map.containsKey(nums[i])&&Math.abs((map.get(nums[i])?.minus(i))){
//              return@abs true
//            }else{
//                map[nums[i]] = i
//            }

        }

        return false
    }
}