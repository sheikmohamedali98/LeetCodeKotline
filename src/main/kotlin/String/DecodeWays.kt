package String

import java.util.*

class DecodeWays {



    fun numDecodings(s: String): Int {
        val n = s.length
        var oneStep = 1
        var twoStep = 0
        if (n == 0 || s[0] == '0') return 0
        for (i in 1 until n) {
            val oneDigit = Character.getNumericValue(s[i])
            val twoDigit = Character.getNumericValue(s[i - 1]) * 10 + oneDigit
            var curStep = 0
            if (oneDigit != 0) curStep += oneStep
            if (twoDigit >= 10 && twoDigit <= 26) {
                if (i < 2) curStep++ // two step is not evaluated until after 2 steps
                else curStep += twoStep
            }
            twoStep = oneStep
            oneStep = curStep
        }
        return oneStep
    }


}

fun main() {
    val obj: DecodeWays = DecodeWays()
    print(obj.numDecodings("gai"))
}