package pattern

/*

1	12	11	10	9

0	2	13	15	8

0	0	3	14	7

0	0	0	4	6

0	0	0	0	5
 */
class DiagonalPattern {

    fun pritPatternNumber(num: Int){
        val matrix = Array(num) { IntArray(num) }
        var number = 1
        var target = (num*(num+1))/2
        var top = 0
        var bottom = num-1
        var left = 0
        var right = num-1
        var row = 0
        var col = 0

        while (number <= target ){

            while (row<=bottom&&col<=right){
                matrix[row][col] = number
                row++
                col++
                number++
            }
        left++
        bottom--
        row = bottom
            col = right
        while (row>=top && number<= target){
            matrix[row][col] = number
            row--
            number++
        }
        right--
        bottom--
        row = top
        col = right

        while (col>=left && number<= target){
            matrix[row][col] = number
            col--
            number++
        }
        top++
        left++
        row = top
        col = left

        }


        for (i in 0 until num) {
            for (j in 0 until num) {
                print("${matrix[i][j]}"+ "\t")
            }
            println("\n")
        }
    }


}
fun main(){
    val diagonalPattern = DiagonalPattern()
    diagonalPattern.pritPatternNumber(5)
}
