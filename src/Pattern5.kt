fun main(){
    print("enter row size: ")
    val row:Int = readLine()!!.toInt()

    for(i in 0 until row){
        for(j in 0 until row-i){
            print("     ")
        }
        for(j in 0 .. i){
            print("  *  ")
        }
        for(j in 0 until i){
            print("  *  ")
        }
        println()
    }
    for(i in 0 ..row){
        for(j in 0 until i){
            print("     ")
        }
        for(j in 0 ..row-i){
            print("  *  ")
        }
        for(j in 0 until row-i){
            print("  *  ")
        }

        println()
    }


}