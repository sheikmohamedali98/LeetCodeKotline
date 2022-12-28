package String

class ValidPalindrome {


    fun validate(string: String): Boolean {
        var left = 0
        var right = string.length - 1

        while (left <= right) {
            if (string.get(left) != string.get(right)) {
                return isPalindrome(string, left + 1, right) || isPalindrome(string, left, right - 1)
            }
            left++
            right--
        }
        return true
    }


    private fun isPalindrome(string: String, start: Int, end: Int): Boolean {
        var s = start
        var e = end
        while (s <= e) {
            if (string.get(s) != string.get(e)) {
                return false
            }
           s++
           e--
        }
        return true
    }


    fun deletAnyCheckPolindrome(string: String): Boolean {
        var left = 0
        var right = string.length - 1

        while (left <= right) {
            if (string[left] != string[right]) {
                println(string)
                return isPalindrome(string, left + 1, right) || isPalindrome(string, left, right - 1)
            }
            left++
            right--
        }
        return true
    }

}

fun main() {
    val validPalindrome = ValidPalindrome()
//    println(validPalindrome.validate("abcbca"))
    println(validPalindrome.deletAnyCheckPolindrome("abcbea"))

}