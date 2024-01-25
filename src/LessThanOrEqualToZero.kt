//Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero,
//otherwise return false.


fun lessThanOrEqualToZero(number:Int):Boolean{
    if(number <= 0){
        return true
    }
    else{
        return false
    }
}

fun main(){
    print("enter a number: ")
    val number:Int = readLine()!!.toInt()

    println(lessThanOrEqualToZero(number))
}