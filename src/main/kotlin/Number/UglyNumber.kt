package Number

class UglyNumber {
    fun isUgly(n: Int): Boolean {

        var n = n
        var i = 2
        while (i < 6 && n != 0) {

            while (n % i == 0) n /= i
            i++
        }
        return n == 1
    }

}
fun main(){
val uglyNumber = UglyNumber()
    println(uglyNumber.isUgly(21))

}