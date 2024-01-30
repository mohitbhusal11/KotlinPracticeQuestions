fun main(){
    print("enter the row size: ")
    val row = readLine()!!.toInt()

    for(i in 1 .. row){
        for(j in i until row){
            print("  ")
        }
        var firstDigit = 1
        for(j in 1 .. i){
            print("  $firstDigit ")
            firstDigit = firstDigit * (i-j)/j
        }
        println()
    }
}
