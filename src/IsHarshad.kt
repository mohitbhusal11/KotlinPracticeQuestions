//A number is said to be Harshad if it's exactly divisible by the sum of its digits.
//Create a function that determines whether a number is a Harshad or not.


fun sumOfDigits(digit:Int):Int{
    var temp = digit
    var ans = 0
    while(temp > 0){
        ans = ans + (temp%10)
        temp = temp / 10
    }
    return ans
}

fun isHarshad(num:Int):Boolean{
    val digitSum = sumOfDigits(num)
    if((num % digitSum) == 0){
        return true
    }
    else{
        return false
    }
}

fun main(){
    print("enter a number: ")
    val number = readLine()!!.toInt()

    println(isHarshad(number))
}