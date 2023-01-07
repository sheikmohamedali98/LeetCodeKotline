package Array

class MinimumRoundsToCompleteAllTasks {
    fun minimumRounds(tasks: IntArray) {

        val map = mutableMapOf<Int,Int>()

        for(index in 0 until tasks.size){
            if(map.containsKey(tasks[index])){
                map.put(tasks[index],map.getValue(tasks[index])+1)
            }else {
                map.put(tasks[index], 1)
            }
        }
        var count = 0

        for(i in 0 until map.size){
        val list=  map.values.toMutableList()

            if(list[i]%3 == 0|| list[i]%2 == 0){
                count = list[i]/3
            }else{

            }

        }

        println(count)
        println(map)
    }
}

//fun main(){
//    val minimumRoundsToCompleteAllTasks = MinimumRoundsToCompleteAllTasks()
//    val tasks = intArrayOf(2,2,3,3,2,4,4,6,6,44,44)
//    minimumRoundsToCompleteAllTasks.minimumRounds(tasks)
//}