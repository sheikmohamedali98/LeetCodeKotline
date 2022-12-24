package Array

class BinarySearchusingRecursion {

fun binarySearch(intArray: IntArray,start:Int,end:Int,findNumber:Int){

    if(start>end){
        return
    }
    val mid = (start+end)/2

    if(intArray[mid] == findNumber){
        println(mid)
        return

    }else if(intArray[mid]<findNumber){
        binarySearch(intArray,mid+1,end,findNumber)
    }else{
        binarySearch(intArray,start,mid-1,findNumber)
    }



}
}

fun main(){
    val intArray = intArrayOf(10,12,14,15,16,20)
    val binarySearchusingRecursion = BinarySearchusingRecursion()
    binarySearchusingRecursion.binarySearch(intArray,0,intArray.size-1,14)

}