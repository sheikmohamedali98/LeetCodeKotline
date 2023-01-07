package Array

class GasStation {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

        var ans = 0
        var total  =0
        var  sum = 0

        for(index in 0 until gas.size){
            sum += gas[index] - cost[index]

            if(sum<0){
                total += sum
                sum = 0
                ans  = index+1
            }

        }
        total += sum
        if(total>=0){
            return ans
        }else{
            return -1
        }
    }
}

fun main(){
    val gasStation = GasStation()
    val gas = intArrayOf(1,2,3,4,5)
    val costs = intArrayOf(3,4,5,1,2)
    println(gasStation.canCompleteCircuit(gas,costs))
}