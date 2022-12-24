package pattern

class HollowDiomnd {

    fun hollowPattern(number:Int){
        for(i in 0 until number){
            var j = 0
            while (j<number){
                print("*")
                val mid = number/2
                val space = if(i<mid)(mid-i-1)else(i-mid)
                var num  = if(i<mid) i*2 else 2*mid-space-1
//                println("num "+num)
                if(j == space){
                    for(k in 0 until num){
                        print(" ")
                       j++
                    }
                }
                j++
            }
            println()
        }
    }
}
fun main(){

    val hollowDiomnd = HollowDiomnd()
    println(hollowDiomnd.hollowPattern(10))
}