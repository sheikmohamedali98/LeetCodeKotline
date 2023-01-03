package String

class DeleteColumnsToMakeSorted {
    fun minDeletionSize(strs: Array<String>): Int {
        var delColumn = 0
        for (row in 0 until strs[0].length) {
            var temp = strs[0][row]
            for (col in 1 until strs.size) {
                if (temp > strs[col][row]) {
                    delColumn++
                    break
                }
                temp = strs[col][row]
            }
        }
        return delColumn
    }
}
fun main(){
    val deleteColumnsToMakeSorted = DeleteColumnsToMakeSorted()
    println(deleteColumnsToMakeSorted.minDeletionSize(arrayOf("cba","daf","ghi")))
}