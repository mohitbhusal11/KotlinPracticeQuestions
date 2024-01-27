//Create a function which validates whether a given array alternates between positive and negative numbers.

fun checkAlternateSign(arr:ArrayList<Int>):Boolean{
    var condi:Boolean = true
    if(arr[0] > 0){
        condi = true
    }else if(arr[0] < 0){
        condi = false
    }else{
        return false
    }
    if(condi){
        for(i in 0 until arr.size){
            if(i%2 == 0 && arr[i] > 0){
                continue
            }else if(i%2 != 0 && arr[i] < 0){
                continue
            }
            else{
                return false
            }
        }
    }
    else{
        for(i in 0 until arr.size){
            if(i%2 == 0 && arr[i] < 0){
                continue
            }else if(i%2 != 0 && arr[i] > 0){
                continue
            }else{
                return false
            }
        }
    }
    return true
}
fun main(){
    print("enter the array size: ")
    val arraySize = readLine()!!.toInt()

    println("enter the array elements")
    val arr = ArrayList<Int>()

    for(i in 0 until arraySize){
        print("enter the $i index element: ")
        arr.add(readLine()!!.toInt())
    }

    val ans:Boolean = checkAlternateSign(arr)
    println("ans --> $ans")
}