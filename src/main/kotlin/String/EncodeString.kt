package String

class EncodeString {
    fun encodeString(string: String){
        val charArray = string.toCharArray()

        var stringWord =  ""
        for(index in 0 until charArray.size){
            val number = charArray[index]- 'A'
            val char = (90-number).toChar()
            stringWord += char


//            println(number)
        }
        println(stringWord)
    }
}

fun main(){
    val encodeString = EncodeString()
    encodeString.encodeString("FADE")
}