package pattern

class XPatternNumber {

    fun printPattern(string: String){
        val  reverseString = string.reversed()
        val size = string.length
        for(row in 0 until string.length){
            for(column in 0 until string.length){
                if(row == column){
                    print(string.get(row))
                }else if (row+column == size-1){
                    print(reverseString.get(row))
                }
                else{
                    print(" ")
                }
            }
            println()
        }
    }
}
fun main(){
    val xPatternNumber = XPatternNumber( )
    xPatternNumber.printPattern("12345")
}