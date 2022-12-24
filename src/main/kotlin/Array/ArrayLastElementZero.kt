package Array

class ArrayLastElementZero {

//    {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}
//{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}
    fun  lastZero(intArray: IntArray):IntArray{
        for(i in 0 until intArray.size){
            for (j in i+1 until intArray.size){
                if (intArray[i] == 0&&intArray[j]!=0){
//                  var temp:Int = intArray[i]
//                    intArray[i] = intArray[j]
//                    intArray[j] = temp
                    swap(intArray,i,j)

                }

            }
        }
        return intArray
    }

    private  fun swap(intArray: IntArray,i:Int,j:Int){
        val temp = intArray[i]
        intArray[i] = intArray[j]
        intArray[j] = temp
    }

      fun  lastZeroOrderOfN(intArray: IntArray):IntArray{
        var count = 0
        for(i in 0 until intArray.size ){
            if(intArray[i]!= 0){
                intArray[count++] = intArray[i]
            }
        }

        while (count<intArray.size){
            intArray[count++] = 0
        }

        return  intArray
    }
}

fun main(){
    val intArray = intArrayOf(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0)
    val arrayLastElementZero = ArrayLastElementZero()
    println(arrayLastElementZero.lastZero(intArray).contentToString())
    println(arrayLastElementZero.lastZeroOrderOfN(intArray).contentToString())
}