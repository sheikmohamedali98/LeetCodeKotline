package String

class Frequenciesinorderofoccurrence {
    fun findFrequency(string: String){
        val  frequency = IntArray(26)
        for(i in 0 until string.length){
            frequency[string.get(i)-'a']++
        }
        for(i in 0 until string.length){
            if(frequency[string.get(i)-'a']!= 0){
                print(string.get(i))
                print("${frequency[string.get(i)-'a']}")
                frequency[string.get(i)-'a'] = 0
            }
        }
    }

    fun finfFrequencyCount(string: String){
        val map = mutableMapOf<Char,Int>()
        val stringArray = string.toCharArray()
        for ( i in stringArray) {
            if (map.containsKey(i)){
                map.put(i,map.getValue(i)+1)
            }else{
                map.put(i,1)
            }
        }
        println(map)

    }
}
fun main(){
    val frequenciesinorderofoccurrence =  Frequenciesinorderofoccurrence()
    frequenciesinorderofoccurrence.findFrequency("java")
    frequenciesinorderofoccurrence.finfFrequencyCount("java")
}