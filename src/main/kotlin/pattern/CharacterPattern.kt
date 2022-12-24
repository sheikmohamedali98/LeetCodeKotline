package pattern

class CharacterPattern {
    fun printCharacter(string: String){
        val char = string[0].toChar()
        println(char)
        val size:Int = (char-65).toInt()
        for(i in 0 .. size){
            for(j in 0 .. (size-i)){
                print((65+j).toChar())
            }
            println()
        }
        for(i in 0 .. size){
            for(j in 0 .. i){
                print((65+j).toChar())
            }
            println()
        }
    }
}

fun main(){
    val characterPattern = CharacterPattern()
    characterPattern.printCharacter("F")
}