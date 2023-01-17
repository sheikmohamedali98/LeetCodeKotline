package pattern

class `Pascal'sTriangleII` {
    fun getRow(rowIndex: Int): List<Int> {
        val list = arrayListOf<Int>()
        var C = 1
        for (i in 0..rowIndex) {
            // The first value in a line is always 1
            list.add(C)

            C = C * (rowIndex - i) / (i + 1)

        }

        return list
    }

    fun printPascal(num: Int) {

        val list = mutableListOf<List<Int>>()
        for (row in 1..num) {
            val innerList = mutableListOf<Int>()
            var c = 1
            for (space in num - row downTo 1) {
                print(" ")
            }
            for (col in 1..row) {
                print("$c ")
                innerList.add(c)
                c = c * (row - col) / (col)
            }
            list.addAll(listOf(innerList))
            println()
        }
println(list)
    }
}

fun main() {
    val pascal = `Pascal'sTriangleII`()
    println(pascal.getRow(30))
    pascal.printPascal(30)
}