package Number

class ClimbingStairs {
    fun climbStairs(n: Int): Int {

        if(n == 1||n==2){
            return n
        }else {
            val num1 = n % 1
            val num2 = n % 2
            return num1 + num2
        }

    }
}
fun main(){
    val climbingStairs = ClimbingStairs()
    println(climbingStairs.climbStairs(4))
}