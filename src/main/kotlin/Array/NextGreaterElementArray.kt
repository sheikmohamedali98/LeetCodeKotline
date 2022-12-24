package Array

class NextGreaterElementArray {

    fun printNextGreaterElement(array:IntArray){

        for(i in 0 until array.size){
            var j = i
            while (j<array.size){
                if(array[i]<array[j]){
                    println("${array[i]} => ${array[j]}  ")
                    break
                }else{
                    j++
                }
            }
        }
    }
}
fun main(){
    val nextGreaterElement = NextGreaterElementArray()
    val intArray = intArrayOf(4,2,6,8,1)
    nextGreaterElement.printNextGreaterElement(intArray)
}