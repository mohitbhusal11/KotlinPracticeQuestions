//Write a function that adds two numbers. The catch, however, is that the numbers will be strings.

fun checkChar(str:String):Boolean{
    for(i in 0 until str.length){
        if((str[i].toInt() >= 65 && str[i].toInt() <= 90) || (str[i].toInt() >= 97 && str[i].toInt() <= 122)){
            return true
        }
    }
    return false
}

fun changeStringToInteger(str:String):Long{
    var ans:Long = 0

    if(checkChar(str)){
        return -1
    }

    for(i in 0 until str.length){
        val tempVal:Long = str[i].toLong() - 48
        ans = (ans*10) + tempVal
    }

    return ans
}

fun main(){
    print("enter first number: ")
    val firstNumberString:String = readLine()!!.toString()
    print("enter second number: ")
    val secondNumberString:String = readLine()!!.toString()

    var ans:Long = 0

    val firstNumber:Long = changeStringToInteger(firstNumberString)
    val secondNumber:Long = changeStringToInteger(secondNumberString)

    if(firstNumber == -1.toLong() || secondNumber == -1.toLong()){
        ans = -1
    }
    else{
        ans = firstNumber + secondNumber
    }

    println("sum of $firstNumberString string and $secondNumberString string -> $ans")

}