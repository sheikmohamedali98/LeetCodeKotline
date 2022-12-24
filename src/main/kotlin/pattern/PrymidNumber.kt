package pattern

/*
              1
             222
            33333
           4444444
          555555555
         66666666666
        7777777777777
       888888888888888
      99999999999999999
     10101010101010101010101010101010101010
    111111111111111111111111111111111111111111
   1212121212121212121212121212121212121212121212
  13131313131313131313131313131313131313131313131313
 141414141414141414141414141414141414141414141414141414
1515151515151515151515151515151515151515151515151515151515
 */
class PrymidNumber {

    fun printPrymid(number:Int){
        val temp = (number*(number+1))/2
        var ans = 1

        for(row in 1 ..temp ){
            for(space in 1 ..  temp-row){
                print(" ")
            }
            for (col in 1 .. 2*row-1){
                print(row)
            }
            println()
        }

    }
}

fun main(){
    val prymidNumber = PrymidNumber()
    prymidNumber.printPrymid(5)
}