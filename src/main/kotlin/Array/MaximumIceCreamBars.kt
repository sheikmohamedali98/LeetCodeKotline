package Array

class MaximumIceCreamBars {
    fun maxIceCream(costs: IntArray, coins: Int):Int{

        var sum = coins
        var count = 0
        costs.sort()

        for(i in 0 until  costs.size){
            if(costs[i]<=sum){
                sum -= costs[i]
                count++
            }
            if(sum==0){
                break
            }
        }

        return count
    }

}

fun main() {
    val maximumIceCreamBars = MaximumIceCreamBars()
    val costs = intArrayOf(1,6,3,1,2,5)
    val coin = 20
   println( maximumIceCreamBars.maxIceCream(costs, coin))
}