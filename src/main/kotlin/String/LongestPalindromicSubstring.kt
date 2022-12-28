package String

class LongestPalindromicSubstring {
    var max = 0
    fun longestPalindrome(s: String) {
        for(i in 2 .. s.length){
            val word = s.subSequence(0 ,i)
            if(checkPalindrom(word.toString())){
                max = maxOf(max,word.length)
            }
            println(word)
        }
println(max)
    }
    fun checkPalindrom(string: String):Boolean{
        var start = 0
        var end = string.length-1

        while (start<=end){
            if(string[start++].toChar()!= string[end--].toChar()){
                return false
            }
        }
        return true
    }
}
fun main(){
    val longestPalindromicSubstring = LongestPalindromicSubstring()
    println(longestPalindromicSubstring.checkPalindrom("mada"))
    longestPalindromicSubstring.longestPalindrome("cbbd")
}