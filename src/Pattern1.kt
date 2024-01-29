fun main(){
    print("enter the row: ")
    val row:Int = readLine()!!.toInt()

    for(i in 0 until row){
        for(j in 0 ..i){
            print("* ")
        }
        println()
    }
}