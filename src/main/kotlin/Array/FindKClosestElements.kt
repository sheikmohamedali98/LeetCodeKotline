package Array

class FindKClosestElements {

    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        var start: Int = 0;
        var end: Int = arr.size - 1

        print("outSide of start  end $start  $end")
        while (end - start >= k) {
            print("inside while of start  end $start  $end")
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++
            } else {
                end--
            }
        }
        print("outSide while start  end $start  $end")

        var list: MutableList<Int> = mutableListOf()
        for (i in start..end) {
            list.add(arr[i])
        }
        return list;
    }

}
fun main(){
    var arr:IntArray = intArrayOf(1,2,3,4,5)
    var k:Int = 4
    var x:Int = -1
  val find:FindKClosestElements = FindKClosestElements()
    print(find.findClosestElements(arr,k,x))
}