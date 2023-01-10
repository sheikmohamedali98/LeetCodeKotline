package Array

class RotateImage {
    fun rotate(matrix: Array<IntArray>): Unit {

        for(row in 0 until matrix.size){
            var len = matrix.size-1
            for(col in 0 until matrix.size){
               print(" ${matrix[len--][row]} ")
            }
            println()
        }

//
//        for(i in 0 until  matrix.size){
//            for(j in 0 until  matrix.size){
//                print(resultMatrix[i][j])
//            }
//            println()
//        }

    }
}

fun main(){
    val matrix = arrayOf(intArrayOf(5,1,9,11), intArrayOf(2,4,8,10), intArrayOf(13,3,6,7), intArrayOf(15,14,12,16))

    val rotateImage =RotateImage()
    rotateImage.rotate(matrix)
}