package pattern

class TrianglePattern {
    fun printPattern(matrix:Array<IntArray>){

        var count = 0
        val number = 2*matrix.size-1

        while(count<=number){
            val list = mutableListOf<Int>()
            for(row in 0 until  matrix.size){
                for(col in 0 until  matrix.size){
                    if(row +col == count)
                    {
                        list.add(matrix[row][col])
//                        print(" ${matrix[row][col]}")
                    }
                }
            }
            println(list)
            count++
        }
    }
}

fun main(){
    val matrix = arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12), intArrayOf(13,14,15,16))

    val trianglePattern = TrianglePattern()
    trianglePattern.printPattern(matrix)
}