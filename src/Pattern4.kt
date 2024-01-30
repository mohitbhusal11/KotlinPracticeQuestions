fun main(){
    print("enter the row size: ")
    val row = readLine()!!.toInt()
    var j = 1
    for(i in 0 until row){
        for(k in 0 until i){
            print("$j ")
            j++
        }
        println()
    }
}