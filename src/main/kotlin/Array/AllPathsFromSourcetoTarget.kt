package Array

class AllPathsFromSourcetoTarget {
    fun allPathsSourceTarget(graph: Array<IntArray>) {

        graph.forEach {
            it.sort()
        }
        graph.sortBy {
            it[0]
        }

        graph.forEach {
            print(it.contentToString())
        }
    }
}

fun main(){
    val allPathsFromSourcetoTarget = AllPathsFromSourcetoTarget()
    val graph = arrayOf(intArrayOf(4,3,1), intArrayOf(3,2,4), intArrayOf(3), intArrayOf(4), intArrayOf(0))
    allPathsFromSourcetoTarget.allPathsSourceTarget(graph)
}