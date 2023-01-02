package String

import java.util.Stack

class LongestPalindromicSubstring {
    var longestPolindrome =""
    val stacks = Stack<Int>()
    fun longestPalindrome(s: String):String {
        stacks.push(0)
        for (i in 0..s.length - 2) {
            for (j in i + 1..s.length) {
                val word = s.subSequence(i, j)
                println(word)
                if (checkPalindrom(word.toString())) {
                    val maxlength = word.length
                    if(maxlength>stacks.peek()||stacks.isEmpty()) {
                        stacks.pop()
                        stacks.push(word.length)
                        longestPolindrome = word.toString()
                    }
                }
            }
        }
       return longestPolindrome
    }

    fun checkPalindrom(string: String): Boolean {
        var start = 0
        var end = string.length - 1

        while (start <= end) {
            if (string[start++].toChar() != string[end--].toChar()) {
                return false
            }
        }
        return true
    }
}

fun main() {
    val longestPalindromicSubstring = LongestPalindromicSubstring()
    println(longestPalindromicSubstring.checkPalindrom("mada"))
   println( longestPalindromicSubstring.longestPalindrome("madam"))
}