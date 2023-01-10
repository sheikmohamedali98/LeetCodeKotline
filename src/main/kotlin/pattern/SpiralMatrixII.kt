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

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {

        val list = mutableListOf<Int>()

        var left = 0
        var right = matrix[0].size - 1
        println(matrix[0].size)
        var top = 0
        var bottom = matrix.size - 1

        for (index in 0 until (matrix[0].size / 2)) {

            for (i in left..right) {
                list.add(matrix[top][i])
            }
            top++
            for (i in top..bottom) {
                list.add(matrix[i][right])
            }
            right--

            for (i in right downTo left) {
                list.add(matrix[bottom][i])
            }
            bottom--

            for (i in bottom downTo top) {
                list.add(matrix[i][left])
            }
            left++
            println(list)
        }
        return list
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

    val spiralMatr = arrayOf(intArrayOf(1,2,3,4), intArrayOf(5,6,7,8), intArrayOf(9,10,11,12))
    println(spiralMatrixII.spiralOrder(spiralMatr))
}