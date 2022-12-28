package Array

class MaximumBagsWithFullCapacityofRocks {
    fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int):Int {
        var extraRock = additionalRocks
        var numberOfBagFull  = 0

        for(i in  0 until capacity.size){
            if(capacity[i] != rocks[i]){
                val  balanceRock = Math.subtractExact(capacity[i],rocks[i])
                if(extraRock>=balanceRock && balanceRock!=0) {
                    rocks[i]+=balanceRock
                    extraRock = extraRock - balanceRock
                }
                println(rocks.contentToString())
            }
            if(capacity[i] == rocks[i]){
                numberOfBagFull++
            }
        }
        return numberOfBagFull
    }
}

fun main(){
    val capacity = intArrayOf(10,2,2)
    val rock = intArrayOf(2,2,0)

    val maximumBagsWithFullCapacityofRocks = MaximumBagsWithFullCapacityofRocks()
    println(maximumBagsWithFullCapacityofRocks.maximumBags(capacity,rock,100))
}