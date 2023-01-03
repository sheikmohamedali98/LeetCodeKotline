package Number

class RomanToInteger {

    fun romanToInt(s: String): Int {
        var i = 0
        var number = 0
        val map: Map<Char, Int> = mapOf(
            'I' to 1, 'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        while (i < s.length) {
            if (i + 1 == s.length) {
                number += map[s[i]]!!
                i++
            } else {
                val current = map[s[i]]!!
                val next = map[s[i + 1]]!!

                if (current < next) {
                    number += (next - current)
                    i += 2
                } else if (current == next) {
                    number += (current + next)
                    i += 2
                } else {
                    number += current
                    i++
                }

            }
        }
        return number
    }
}

fun main() {
    val romanToInteger = RomanToInteger()
    println(romanToInteger.romanToInt("VI"))
}