package Array

class FindIntersectionOfTwoArray {

    fun interSection(array1:IntArray,array2:IntArray){
        var i = 0
        var j  =0
        val arrayList = ArrayList<Int>()

        while (i<array1.size&&j<array2.size){
            if(array1[i] == array2[j]){
                arrayList.add(array1[i])
                i++
                j++
            }else if (array1[i]>array2[j]){
                j++
            }else{
                i++
            }
        }
        println(arrayList.toString())
    }

    fun intersectionAnother(array1: IntArray,array2: IntArray){
        val arrayList = ArrayList<Int>()

        for(i in 0 until  array1.size){
            for(j in 0 until array2.size){
                if(array1[i] == array2[j]){
                    arrayList.add(array1[i])
                }
            }
        }
        println(arrayList)
    }

    fun insersectionSet(array1: IntArray,array2: IntArray){
        val set = mutableSetOf <Int>()

        array1.forEach { set.add(it) }

        for (value in array2 ){
            if(set.contains(value)){
                println(value)
            }
        }

    }
}

fun main(){
    val findIntersectionOfTwoArray = FindIntersectionOfTwoArray()
    val array1 = intArrayOf(2,3,6,7,9,11)
    val array2  = intArrayOf(4,6,8,9,12)

    findIntersectionOfTwoArray.interSection(array1,array2)
    findIntersectionOfTwoArray.intersectionAnother(array1,array2)
    findIntersectionOfTwoArray.insersectionSet(array1,array2)
}