package String

class LexicographicallySmallestEquivalentString {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {

        val string = ""

        val list = mutableListOf(mutableSetOf<String>())
        list.removeAt(0)
        for (i in s1.indices){
            val set = mutableSetOf<String>()
            set.add(s1[i].toString())
            set.add(s2[i].toString())
            if(list.contains(set)){
                println(list)
                list.addAll(listOf(set))
            }else{
                list.addAll(listOf(set))
            }
        }

        println(list)
        return string
    }
}

//fun main(){
//    val lexicographicallySmallestEquivalentString = LexicographicallySmallestEquivalentString()
//
//    val s1 = "parker"
//    val s2  = "morris"
//    val base = "parser"
//    println(lexicographicallySmallestEquivalentString.smallestEquivalentString(s1,s2,base))
//}