package recurssion

class StringReverse {
    fun reverse(str:String):String{
        if(str == null || str.length<=1){
            return str
        }
        return reverse(str.substring(1))+str[0]
    }
}
fun main(){
    val strindReverse = StringReverse()
    println(strindReverse.reverse("sheik"))
}