package Array

class FindBetweenNumber {
    fun brtweenNumber(intArray: IntArray,startNumber:Int,endNumber:Int){

        for (index in 0 until intArray.size){
            if(intArray[index]>startNumber&&intArray[index]<endNumber){
                println(intArray[index])
            }
        }

    }
}
fun main(){
    val findBetweenNumber = FindBetweenNumber()
    val intArray = intArrayOf(4, 3, 7, 11, 50, 1)

    val startNumber = 4
    val endNumber = 10
    findBetweenNumber.brtweenNumber(intArray,startNumber,endNumber)

}