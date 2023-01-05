package Array

class MinimumNumberOfArrowsToBurstBalloons {
    fun findMinArrowShots(points: Array<IntArray>): Int {

//        points.forEach {
//            it.sort()
//        }
        points.sortWith( compareBy{ it[1] } )

        points.forEach {
            print(it.contentToString())
        }

        var count = 0
        var index = 0
        while (index < points.size) {
            val value = points[index][1]
            for (i in index + 1 until points.size) {
                if (value >= points[i][0] && value <= points[i][1]) {
                    count++
                    index++
                } else {
                    break
                }
            }
            index++
        }
        if(points.size%2 !=0){
            count++
        }

        if (count == 0) {
            count = points.size
        }
        return count
    }
    fun findMinArrowShots2(points: Array<IntArray>): Int {

        points.sortWith( compareBy{ it[1] } )

        points.forEach { print(it.contentToString()) }
        var end = points[0][1]
        var count = 1
        for(index in 1 until points.size){
            if(points[index][0] > end){
                count++
                end = points[index][1]
            }
        }
        return count

    }
}

fun main() {
    val minimumNumberOfArrowsToBurstBalloons = MinimumNumberOfArrowsToBurstBalloons()
    val array = arrayOf(intArrayOf(3,9), intArrayOf(7,12), intArrayOf(3,8), intArrayOf(6,8), intArrayOf(9,10),
        intArrayOf(2,9), intArrayOf(0,9), intArrayOf(3,9), intArrayOf(0,6), intArrayOf(2,8)
    )
//    [10,16],[2,8],[1,6],[7,12]
//    [3,9],[7,12],[3,8],[6,8],[9,10],[2,9],[0,9],[3,9],[0,6],[2,8]
    println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots(array))

    println(minimumNumberOfArrowsToBurstBalloons.findMinArrowShots2(array))
}