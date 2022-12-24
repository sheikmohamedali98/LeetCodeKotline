package String

class ValidPalindrome {


    fun validate(string: String):Boolean{
        var left = 0
        var right = string.length-1

        while (left<= right){
            if(string.get(left)!= string.get(right)){
                return isPalindrome(string,left+1,right) ||isPalindrome(string,left,right-1)
            }
            left++
            right--
        }
        return true
    }



  private  fun  isPalindrome(string: String,start:Int,end:Int):Boolean{

      while (start<=end){
          if(string.get(start)!=string.get(end)){
              return false
          }
          start.plus(1)
          end.minus(1)
      }
      return true
  }

}

fun main(){
    val validPalindrome = ValidPalindrome()
    println(validPalindrome.validate("abcbca"))
}