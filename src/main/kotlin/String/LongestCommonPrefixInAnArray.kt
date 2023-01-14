package String

class LongestCommonPrefixInAnArray {

    fun findCommonPrefix(string: Array<String>) {

        var min = 1000
        var str = ""
        var flag = 0
        var count = 0
        for (i in 0 until string.size) {
            val length = string[i].length
            if (length < min) {
                min = length
                str = string[i]
            }
        }
        for (i in str.indices) {
            for (element in string) {
                if (element[i] != str[i]) {
                    flag = 1
                    break
                }
            }
            if (flag == 1)
                break
            count++
        }

        if (count == 0) {
            str = "-1"
        } else {
            str = str.subSequence(0, count).toString()
        }

        println(str)

    }
}

fun main() {
    val longestCommonPrefixInAnArray = LongestCommonPrefixInAnArray()
    val string = arrayOf("geeksforgeeks", "geeks", "geek", "geezer")
    longestCommonPrefixInAnArray.findCommonPrefix(string)
}