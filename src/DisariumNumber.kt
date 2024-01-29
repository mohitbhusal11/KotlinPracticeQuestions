//A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.
//Create a function that determines whether a number is a Disarium or not.

//example -> (75) -> 7^1 + 5^2 -> 7 + 25 -> 32 != 75 -> false


fun pow(digit:Int,power:Int):Int{
//    var ans = 0
    var tempDigit = digit
    for(i in 0 until power){
        tempDigit = tempDigit * digit
    }
    return tempDigit
}

fun isDisarium(num:String):Boolean{
    var ans = 0
    for(i in 0 until num.length){
        val position = i
        val digit = (num[i].toInt()) - 48
        val tempAns = pow(digit,position)
        ans += tempAns
    }
    return ans == num.toInt()
}

fun main(){
    print("enter a number: ")
    val num = readLine()!!.toString()

    println("ans --> " + isDisarium(num))
}