package String

class WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {


        val stringArray = s.split(" ")
        if(pattern.length!= stringArray.size){
            return false
        }
        val map = mutableMapOf<Char,String>()

        for(index in 0 until pattern.length){
            if(map.containsKey(pattern[index])){
                if(stringArray[index] != map[pattern[index]]){
                    return false
                }
            }else{

                if(map.containsValue(stringArray[index])){
                    return false
                }
                map[pattern[index]] = stringArray[index]
            }
        }
        return true
    }
}

fun main(){
    val wordPattern = WordPattern()
    println(wordPattern.wordPattern("aaaa","dog cat cat dog"))
}