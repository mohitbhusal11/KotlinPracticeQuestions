//Create a function that takes a number as an argument and returns "true" if the number is a valid credit card number, "false" otherwise

fun reverse(num:Long):Long{
    var ans:Long = 0
    var tempNum = num
    while(tempNum > 0){
        val tempVal = tempNum % 10
        ans = (ans * 10) + tempVal
        tempNum = tempNum / 10
    }
    return ans
}

fun findSumOfNumber(num:Long):Long{
    var ans:Long = 0
    var tempNum = num
    while(tempNum > 0){
        val tempVal = tempNum % 10
        ans += tempVal
        tempNum /= 10
    }
    return ans
}

fun selectiveDoubling(num:Long):Long{
    var ans:Long = 0
    var odd = true
    var tempNum = num
    while(tempNum > 0){
        val tempVal:Long = tempNum % 10
        var tempdigit:Long = tempVal
        if(odd){
            val doubleTempVal:Long = tempVal * 2
            if(doubleTempVal >= 10){
                tempdigit = findSumOfNumber(doubleTempVal)
            }
            else{
                tempdigit = doubleTempVal
            }
            odd = false
        }
        else{
            odd = true
        }
        ans = ( ans * 10 ) + tempdigit
        tempNum = tempNum / 10
    }
    return ans
}

fun checkValidCreditCard(num:Long):Boolean{
    val lastDigit = num%10
    val tempNum = num / 10
//    var reverseNumber = reverse(tempNum)
    val selectiveNumber = selectiveDoubling(tempNum)
    val totalSum = findSumOfNumber(selectiveNumber)
    println("total sum --> $totalSum")
    val lastDigitOfTotalSum = totalSum % 10
    val ans = -(lastDigitOfTotalSum - 10)
    println("last digit of total sum --> $lastDigitOfTotalSum")
    println("ans after sub --> $ans")
    return ans == lastDigit
}

fun findSize(num:Long):Int{
    var ans = 0
    var tempNum = num
    while(tempNum > 0){
        ans += 1
        tempNum /= 10
    }
    return  ans
}

fun main(){
    print("enter the number: ")
    val creditCard:Long = readLine()!!.toLong()
    var ans: Boolean = true
    if(findSize(creditCard) >= 14 && findSize(creditCard) <= 19){
        if(checkValidCreditCard(creditCard)){
            ans = true
        }
        else{
            ans = false
        }
    }
    else{
        ans = false
    }
    println("--------------\nans is --> $ans\n-----------------")
}