package String

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val list:MutableList<MutableList<String>> = mutableListOf(mutableListOf())
        list.removeAt(0)
        val listString = strs.toMutableList()
        if(strs.isEmpty() || strs.size ==1) {
            val string = strs.toMutableList()
            list.addAll(listOf(string))
            return list
        }

        for(i in 0 until  strs.size){
            val word = strs[i].toCharArray()
            word.sort()
            println("word ${word.toList()}")
            val compareList = mutableListOf<String>()
            compareList.add(strs[i])
            for(j in i+1 until strs.size){
                val  compareWord = strs[j].toCharArray()
                compareWord.sort()
                println("compare word ${compareWord.toList()}")
                if(word.contentEquals((compareWord))){
                    compareList.add(strs[j])
                }
            }
            list.addAll(listOf(compareList))
        }
        return list
    }


    fun groupAnagrams1(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,List<String>>()
        for(str in strs){
            val sort = str.toCharArray().apply { sort() }.joinToString("")
            if(!map.containsKey(sort)){
                map[sort] = mutableListOf<String>()
            }
            val strList = map.get(sort)!!.plus(str)
            map[sort] = strList
        }
        return map.values.toList()
    }

}

fun main(){
    val stns = arrayOf("eat","tea","tan","ate","nat","bat")
    val groupAnagrams = GroupAnagrams()
    println(groupAnagrams.groupAnagrams(stns))

    println(groupAnagrams.groupAnagrams1(stns))
}