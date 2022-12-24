package String

class RemoveDublicateString {
    fun rermoveDublicate(string:String){

        val set = mutableSetOf<String>()
        val stringArray = string.split(" ")
        for(index in 0 until stringArray.size){
            set.add(stringArray[index])
        }
        var stringWord = ""

//        for (index in 0 until set.size){
            set.forEach{print("${it} ")}

    }
}

fun main(){
    val removeDublicateString = RemoveDublicateString()
    removeDublicateString.rermoveDublicate("This is Zoho and Zoho is Good")
}