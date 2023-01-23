package String

class LetterCombinationsofaPhoneNumber {
//    : List<String>
    fun letterCombinations(digits: String) {
        val map = mutableMapOf<String,String>()
        map["2"] = "abc"
        map["3"] = "def"
        map["4"] = "ghi"
        map["5"] = "jkl"
        map["6"] = "mno"
        map["7"] = "pqrs"
        map["8"] = "tuv"
        map["9"] = "wxyz"
//    val list = letterCombination()
    val array = ArrayList<String>(digits.length)

    for (i in 0 until  digits.length){
        if(map.containsKey(digits[i].toString())){
//            map[digits[i].toString()]?.let { list.add(it) }
        }
    }

//    println(list)

    }
}

//fun main(){
//    val letterCombinationsofaPhoneNumber = LetterCombinationsofaPhoneNumber()
//    val number = "234"
//    letterCombinationsofaPhoneNumber.letterCombinations(number)
//}