//Create two functions:
//1 the first is "isOdd()" to check if a given number is odd using bitwise operator.
//2 the second is "isEven()" to check if a given input is even using regular expression.


fun isOdd(num:Int):Boolean{
    if((num and 1) == 0){
        println("this is even")
        return false
    }
    else{
        println("this is odd")
        return  true
    }
}

fun isEven(num: Int):Boolean{
    if(num % 2 == 0){
        println("this is even")
        return true
    }
    else{
        println("this is odd")
        return false
    }
}

fun main(){
    print("enter the number: ")
    val num:Int = readLine()!!.toInt()

    print("using isOdd() --> ${isOdd(num)} \n")
    print("using isEven() --> ${isEven(num)}")
}