package String

class OddStringDifference {

    fun oddString(words: Array<String>): String {
        val list = mutableListOf<List<Int>>()
        for (i in 0 until words.size) {
            val array = mutableListOf<Int>()
            for (j in 0 until words[i].length - 1) {
                val number1 = words[i][j].code
                val number2 = words[i][j + 1].code
                val value = number2 - number1
                array.add(value)
            }
            list.addAll(listOf(array))
        }
        val set = mutableSetOf<List<Int>>()
        var str = ""

        for (i in 0 until list.size) {
            if (!set.contains(list[i])) {
                str = words[i]
            }
            set.add(list[i])
        }
        println(list)
        return str
    }
    fun oddString1(words: Array<String>): String {
        val map = hashMapOf<String, Int>()
        val map2 = hashMapOf<String, String>()
        words.forEach {
            var key = ""
            for (i in 0..it.length - 2) {
                key += (it[i] - it[i + 1])
            }
            map[key] = map.getOrDefault(key, 0) + 1
            map2[key] = it
        }

        map.forEach {
            if (it.value == 1)
                return map2[it.key]!!
        }
        return ""
    }
}

fun main() {
    val oddStringDifference = OddStringDifference()
    val words = arrayOf("adc", "wzy", "abc", "wyz", "pqr","pqr","wyz","xyz","afc")
    println(oddStringDifference.oddString(words))
    println(oddStringDifference.oddString1(words))
}

