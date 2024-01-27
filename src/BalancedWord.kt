//We can assign a value to each character in a word, based on their position in the alphabet (a=1, b=2, ....., z=26).
//A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side.
//For odd length words, the middle character (balance point) is ignored.
//Write a function that returns "true" if the word is balanced, and "false" if it's not.


fun findBalancePoint(str:String):Int{
    var ans = 0
    for(i in 0 until str.length){
        val tempVal:Int = str[i].toInt() - 96
        ans = ans + tempVal
    }
    return ans
}

fun checkBalancedWord(str:String,firstEnd:Int,secondStart:Int):Boolean{
    val firstStr = slice(str,0,firstEnd)
    val secondStr = slice(str,secondStart,str.length)

    val firstSum = findBalancePoint(firstStr)
    val secondSum = findBalancePoint(secondStr)

    if(firstSum == secondSum){
        return true
    }
    else{
        return false
    }
}

fun main(){
    print("enter the string: ")
    val str:String = readLine()!!.toString()
    var ans:Boolean = true
    if(str.length % 2 == 0){
        ans = checkBalancedWord(str,((str.length)/2),((str.length)/2))
    }
    else{
        ans = checkBalancedWord(str, ((str.length)/2), ((str.length)/2)+1)
    }
    println("ans is --> $ans")
}