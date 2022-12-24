package Number

class PerfectSquares {
    fun numSquares(n: Int): Int {
        if(n<4){
            return n
        }
        if(n<12&&n>4){
            val number = n/4
            val anser = n%4
            return  number+anser

        }
        if(n%4 ==0){
            return  n/4
        }
        val number = n%4
        println("number $number")
        val ans = n -(number*9)
        println("answer $ans")
        val count = ans/4


        return number+count

    }
}
fun main(){
    val perfectSquares = PerfectSquares()
    println(perfectSquares.numSquares(11))
}