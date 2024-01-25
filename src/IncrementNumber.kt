//Create a function that takes a number as an argument,
//increments the number by +1 and returns the result


fun incrementBy1(number:Int): Int {
    val ans = number + 1
    return ans
}
fun main(){
    print("Enter the number: ")
    val number = readLine()!!.toInt()
    val ans = incrementBy1(number)
    println("ans is: $ans")
}