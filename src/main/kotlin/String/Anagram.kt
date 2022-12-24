package String


class Anagram {
    fun validateAnagram(word1:String,word2:String):Boolean{
        val charArray1 = word1.toCharArray()
        val charArray2 =  word2.toCharArray()


        charArray1.sort()
        charArray2.sort()

        print(charArray1)
        print(charArray2)
        val sortedArray1 = charArray1.toString()
        val sortedArray2  = charArray2.toString()

        return sortedArray1.equals(sortedArray2)
    }

}

fun main(){
    println("ENter the two String")
    val word1:String = readLine()!!
    val word2:String = readLine()!!

    val anagram:Anagram = Anagram()
    val ans = anagram.validateAnagram(word1,word2)
    print("the given words are  ${ans}")

}