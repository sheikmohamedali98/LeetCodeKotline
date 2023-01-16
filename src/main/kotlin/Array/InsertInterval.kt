package Array

class InsertInterval {

    //
    fun insert(intervals: Array<IntArray>, newInterval: IntArray) {

        var value = newInterval[0]
        var startIndex = 0
        val answer = IntArray(2)
        for (i in 0 until intervals.size) {
            val number1 = intervals[i][0]
            val number2 = intervals[i][1]
            if (value in number1..number2) {
                if (startIndex == 0) {
                    answer[startIndex++] = number1
                } else {
                    answer[startIndex++] = number2
                }
                value = newInterval[1]
            }

        }
        println(answer.contentToString())


    }

    fun insert1(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray>{

        val newList = mutableListOf<IntArray>()
        var start = newInterval[0]
        var end = newInterval[1]
        var index = 0

        while (index < intervals.size && intervals[index][1] < start) {
            newList.add(intervals[index++])
        }

        while (index < intervals.size && intervals[index][0] <= end) {
            start = minOf(intervals[index][0], start)
            end = maxOf(intervals[index++][1], end)
        }

        newList.add(intArrayOf(start, end))

        while (index < intervals.size) {
            newList.add(intervals[index++])
        }
        return newList.toTypedArray()
    }


}

fun main() {
    val insertInterval = InsertInterval()
    val interval = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(6, 7), intArrayOf(8, 10), intArrayOf(12, 16))
    val newInterval = intArrayOf(4, 8)
    insertInterval.insert(interval, newInterval)

    insertInterval.insert1(interval, newInterval).forEach {
        println(it.contentToString())
    }
}