package pattern

/*
                1
                            2 2 2
                          2 2 2 2 2
                        3 3 3 3 3 3 3
                      3 3 3 3 3 3 3 3 3
                    3 3 3 3 3 3 3 3 3 3 3
                  4 4 4 4 4 4 4 4 4 4 4 4 4
                4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
              4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
            4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
          5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
        5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
      5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
    5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
  5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
 */
class PrymidNumber {

    fun pattern(n: Int) {
        var colCount = 1

        val rowCount = (n * (n + 1)) / 2 // sum of N natural numbers

        var numToPrint = 1
        var loopExecutionCount = 0

        for (row in 0 until rowCount) {
            for (spaces in 0 until rowCount - row) {
                print("  ")
            }

            for (elements in 0 until colCount) {
                print("$numToPrint ")
            }
            colCount += 2
            println()

            if (++loopExecutionCount == numToPrint) {
                numToPrint++
                loopExecutionCount = 0
            }
        }
    }
}

fun main(){
    val prymidNumber = PrymidNumber()
    prymidNumber.pattern(5)
}