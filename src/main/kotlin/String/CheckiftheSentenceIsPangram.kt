package String

class CheckiftheSentenceIsPangram {

}

private fun pangram(str: String): Boolean? {
    val map: MutableMap<Char, Int> = HashMap()

//		String str = "thequickbrownfoxjumpsoverthelazydog";
    for (ch in str.toCharArray()) map[ch] = map.getOrDefault(ch, 0) + 1
    return map.size == 26
}



    fun checkIfPangram(sentence: String): Boolean {
        // We iterate over 'sentence' for 26 times, one for each letter 'currChar'.


        for (i in 0..25) {
            val currChar = ('a'.code + i).toChar()

            // If 'sentence' doesn't contain currChar, it is not a pangram.
            if (sentence.indexOf(currChar) == -1) return false
        }

        // If we manage to find all 26 letters, it is a pangram.
        return true
    }
fun main(){
//    println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))
//    println(pangram("thequickbrownfoxjumpsoverthelazydog"))
    println(pangram("leetcode"))


}