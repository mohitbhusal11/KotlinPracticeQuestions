//Create function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
//Otherwise, return "there is no 7 in the array".


fun getArrayInputs(myArray: Array<Int>){
    for(i in 0 until myArray.size){
        myArray[i] = readLine()!!.toInt()
    }
    return
}


fun checkThisEdgeCase(num:Int):Boolean{
    var temp = num
    while(temp > 0){
        val value = temp%10
        if(value == 7){
            return true
        }
        temp = temp/10
    }
    return false
}

fun checkElement(myArray: Array<Int>):String{
    for(i in 0 until myArray.size){
        if(myArray[i] == 7){
            return "Boom!"
        }
        else if(myArray[i] > 10){
            if(checkThisEdgeCase(myArray[i])){
                return "Boom!"
            }
        }
    }
    return "there is no 7 in the array"
}

fun main(){
    print("enter the size of array: ")
    val arraySize = readLine()!!.toInt()
    val myArray:Array<Int> = Array<Int>(arraySize){0}
    getArrayInputs(myArray)
    val result:String = checkElement(myArray)
    println(result)
}