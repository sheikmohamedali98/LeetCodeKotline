package String

class DetectCapital {
    fun detectCapitalUse(word: String): Boolean {

        var capitalCount = 0
        var smallCount = 0
        for(i in 0 until word.length){
            val num:Int = word[i].toInt()
            if(num in 65..90){
                capitalCount++
            }
            if(num  in 97..123){
                smallCount++
            }
        }

        if(word[0].toInt()>=65&&smallCount== (word.length-1)&&word[0].toInt()<=90){
            return true
        }
        return capitalCount == word.length ||smallCount == word.length
    }
}
fun main(){
    val detectCapital = DetectCapital()
    println(detectCapital.detectCapitalUse("Amazon"))
}