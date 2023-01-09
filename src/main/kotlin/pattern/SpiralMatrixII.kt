package pattern

class SpiralMatrixII {
    //
    fun generateMatrix(n: Int): Array<IntArray> {
        var matrix = Array(n) { IntArray(n) }
        var number = 1
        var left = 0
        var right = n - 1
        var top = 0
        var bottom = n - 1

        while (number <= n * n) {

            for (i in left..right) {
                matrix[top][i] = number++
            }
            top++
            for (i in top..bottom) {
                matrix[i][right] = number++
            }
            right--

            for (i in right downTo left) {
                matrix[bottom][i] = number++
            }
            bottom--

            for (i in bottom downTo top) {
                matrix[i][left] = number++
            }
            left++
        }


//        for(i in 0 until matrix.size){
//            for(j in 0 until matrix.size){
//               print( " ${matrix[i][j]} ")
//            }
//            println()
//        }

        return matrix
    }
}

fun main() {
    val spiralMatrixII = SpiralMatrixII()
    val matrix = spiralMatrixII.generateMatrix(5)
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix.size) {
            print(" ${matrix[i][j]} ")
        }
        println()
    }
}