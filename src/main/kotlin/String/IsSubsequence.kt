package String

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        var j = 0
        if(s.length == 0){
            return true
        }
        for(i in 0 until t.length){
            if(s[j].equals(t[i])){
                j++
                if(j == s.length){
                    return true
                }
            }
        }

        return false
    }
}
fun main(){
    val isSub = IsSubsequence()
    println(isSub.isSubsequence("abc","ahbgdc"))
}