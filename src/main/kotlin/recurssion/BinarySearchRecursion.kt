package recurssion

class BinarySearchRecursion {

    fun findElement(array: IntArray,start:Int,end:Int,search:Int):Int{
        val mid = (start+end)/2
        if(array[mid] == search){
            return mid
        }else if(search>array[mid]){
            return findElement(array,mid+1,end,search)
        }else{
            return findElement(array,start,mid-1,search)
        }

    }
}

fun main(){
    val binarySearchRecursion = BinarySearchRecursion()
    val intArray = intArrayOf(10,12,14,15,16,20)
    println(binarySearchRecursion.findElement(intArray,0,intArray.size-1,20))
}