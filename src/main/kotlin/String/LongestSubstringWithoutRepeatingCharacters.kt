package String

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {

        var max:Int = 0
        var len = s.length
        var j = 0
        var i = 0

//        for(i in 0 until s.length){
//            var string = s.substring(i,j)
//            println(string)
//        }
        while (i<len){
            j = i+1
            while (j<len){
            var string = s.substring(i,j)
                println(string)
                j++
            }
            j = 0
            i++

        }

     return max
    }
}

fun main(){
   val ch:LongestSubstringWithoutRepeatingCharacters  = LongestSubstringWithoutRepeatingCharacters()
    print(ch.lengthOfLongestSubstring("abcabcab"))
}