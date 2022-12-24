package String

class EncryptedString {
    fun encrypt(string1:String,string2: String):String{
        val size = string1.length
        var encrypted:String = ""
        for(index in 0 until size ){
            val number1 = string1.get(index)-'a'
            val number2 = string2.get(index)-'a'
            val number = (number1+number2)%26

            val char:Char = (number+98).toChar()
            encrypted += char
//            println("${number1}   ${number2}")
//            println("${number}")
//            println("${char}")
        }

       return  encrypted

    }
}

fun main(){
    val encryptedString = EncryptedString()
    println("Enter The String 1")
    val string1 = readLine()!!.toLowerCase()
    println("Enter The String 2")
    val string2 = readLine()!!.toLowerCase()

    println(encryptedString.encrypt(string1,string2))
}