package Array

class AddEvenPostionChange {
    fun positionChange(intArray: IntArray):IntArray{

        val length = intArray.size
        var indexEven = 0
        var indexOdd = 1

        while (true) {
            while (indexEven < intArray.size && intArray[indexEven] % 2 == 0)
                indexEven += 2

            while (indexOdd < intArray.size && intArray[indexOdd] % 2 != 0)
                indexOdd += 2

            if (indexEven < length && indexOdd < length) {
                val temp = intArray[indexEven]
                intArray[indexEven] = intArray[indexOdd]
                intArray[indexOdd] = temp
            }else
            {
                break
            }
        }
        return  intArray

    }
}

fun main(){

    val intArray = intArrayOf(10, 9, 7, 18, 13, 19, 4, 20, 21, 14)
    val addEvenPostionChange = AddEvenPostionChange()
    println(addEvenPostionChange.positionChange(intArray).contentToString())
}