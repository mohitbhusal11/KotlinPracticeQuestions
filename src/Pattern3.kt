fun main(){
    print("enter row size: ")
    val row = readLine()!!.toInt()

    for(i in 0 until row){
        for(j in 0 until row-i){
            print("  ")
        }
        for(j in 0 .. i){
            print(" " + i+j)
        }
        for(j in 0 until i){
            print(" " + i+j)
        }
        println()
    }
}