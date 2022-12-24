package Number

class NumberOfDigit {

    fun findNumberOfDigit( number:Int):Int{

        var numberCount = number
        var counter = 0
        while (numberCount>0){
            counter++
            numberCount = numberCount/10
        }
        return counter
    }
}
fun main(){
    val numberOfDigit = NumberOfDigit()
    println(numberOfDigit.findNumberOfDigit(1))
}