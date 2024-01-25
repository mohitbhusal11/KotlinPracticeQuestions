//Create a function that recursively counts the integer's number of digits.


fun recursiveCount(num:Int):Int{
    if(num <= 0){
        return 0
    }
    val ans = 1 + recursiveCount(num/10)
    return ans
}

fun main(){
    print("enter the number: ")
    var number = readLine()!!.toInt()
    if(number < 0){
        number = -number
    }
    val ans = recursiveCount(number)
    println("total digits in $number --> $ans ")
}