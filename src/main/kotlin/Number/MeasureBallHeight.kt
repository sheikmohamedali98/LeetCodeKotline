package Number

class MeasureBallHeight {
    fun ballHeight(int: Int){
        var number:Float = int.toFloat()
        var ans:Float = 0.0F
        while (number>=1){
           ans += (number*2)
           number = number/2

        }
        println(ans-int)
    }
}
fun main(){
    val measureBallHeight = MeasureBallHeight()
    measureBallHeight.ballHeight(2)
}