package Array

import java.util.Stack

class BestTimeToBuyAndSellStockWithTransactionFee {
    fun maxProfit1(prices: IntArray, fee: Int){
        val stack = Stack<Int>()
        stack.push(0)
        var anser = 0
        var buyingPrice = prices[0]
        var profit = 0
        for(index in 1 until prices.size-1){
            println("buying $buyingPrice")
            profit = (prices[index]- buyingPrice)-fee
            if(stack.isEmpty()||stack.peek()<profit){
                stack.pop()
                stack.push(profit)
                if(profit>(prices[index+1]- buyingPrice)-fee){
                    anser += profit
                    buyingPrice = prices[index+1]
                    stack.clear()
                    stack.push(0)
                }
            }

        }


        println("anser $anser")
        println(buyingPrice)
        println(stack)
    }

    fun maxProfit(prices: IntArray, fee: Int):Int{
        var hold = Int.MIN_VALUE
        var sold = 0

        for(price in prices){
            hold = maxOf(hold, sold - price)
            println("hold $hold")
            sold = maxOf(sold, hold + price - fee)
            println("sold $sold")

        }
        return sold
    }
}
fun main(){
    val bestTimeToBuyAndSellStockWithTransactionFee = BestTimeToBuyAndSellStockWithTransactionFee()
    val prices = intArrayOf(1,3,2,8,4,9)
    val fee = 2
   println( bestTimeToBuyAndSellStockWithTransactionFee.maxProfit(prices, fee))
}