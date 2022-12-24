package String

import java.util.*

class ReverseString {
    fun reverse(string:String):String{

        var start = 0
         var end = string.length - 1
        var charArray = string.toCharArray()
        while(start<end){

            var temp:Char =  charArray[start]
            charArray[start] = charArray[end]
            charArray[end] = temp
            start++
            end--

        }
        println(charArray.contentToString())
        var word:String = charArray.toString()

//        print(word)
        return word

    }


    fun reverseStringStack(string: String):String{
        val stack = Stack<Char>()
        var str:String = ""
        for(i in 0 until  string.length){
            stack.push(string.get(i))
        }
        var word = ""

        while (!stack.empty()){
//            str += stack.pop().toString()
             word = word+stack.pop()
//            print("${stack.pop()}")
        }
        return  word
//        println(str)
    }

    fun reverseEachWords(word:String):String{
        val stringArray = word.split(" ")
        var reverse = ""

        var reversword = " "
        for (i in 0 until stringArray.size){
//            println(stringArray[i])
            reversword =  reverseStringStack(stringArray[i])
//            println(reversword)
           reverse =  reverse +reversword + " "
        }
        return reverse
//        println(stringArray)
    }
}

fun main(){
    val reverseString = ReverseString()
    reverseString.reverse("Hello")
println()
    reverseString.reverseStringStack("java")

    val word = "kotlin programming"
    println( reverseString.reverseEachWords(word))
}