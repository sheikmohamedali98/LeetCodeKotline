package Array

class DublicateAddZero {
    fun dublicateReplaceZero(intArray: IntArray){

        val set = mutableSetOf<Int>()
        for(index in 0 until intArray.size){
            if(set.add(intArray[index])){

                println(index)
//                println("faib")
//                set.remove(intArray[index])
            }else{
                intArray[index] = 0
            }
        }

        println(intArray.contentToString())

    }
}
fun main(){
    val dublicateAddZero = DublicateAddZero()
    val intArray = intArrayOf(1,2,2,5,3,5,6,5)
    dublicateAddZero.dublicateReplaceZero(intArray)
}