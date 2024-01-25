//Create a function that takes two integers and checks if they are equal


fun isEqual(number1:Int, number2:Int):Boolean{
    return number1 == number2
}

fun main(){
    print("enter number 1: ")
    val number1 = readLine()!!.toInt()
    print("enter number 2: ")
    val number2 = readLine()!!.toInt()

    println(isEqual(number1, number2))
}