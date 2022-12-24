package pattern

class SnakeLadder {
    fun printSnakePatter(int: Int){

        var number = 0
        for(row in 0 until int){
            for(space in 0 until (int-row) ){
                print(" ")
            }

                if(row%2 ==0) {
                    for(col in 0 until int) {
                        print("${++number} ")
                    }

                    number+=int
                }else{
                    for(col in 0 until int) {
                        print("${number--} ")
                    }
                    number+=int

                }
            println()
        }
    }
}
fun main(){
    val snakeLadder = SnakeLadder()
    snakeLadder.printSnakePatter(5)
}