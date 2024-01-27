//Create a method that takes an array of integers and returns a new array,
//sorted in ascending order (smallest to biggest).


fun sortNumsAscending(arr:Array<Int>):Array<Int>{
    for(i in 0 until arr.size){

        for(j in i until arr.size){
            if(arr[i] > arr[j]){
                val tempVal = arr[j]
                arr[j] = arr[i]
                arr[i] = tempVal
            }
        }
    }
    return arr
}

fun main(){
    print("enter size of array: ")
    val arraySize = readLine()!!.toInt()

    println("enter the array elements")
    val arr:Array<Int> = Array(arraySize){0}

    for(i in 0 until arraySize){
        print("enter the $i index element: ")
        arr[i] = readLine()!!.toInt()
    }

    val ans:Array<Int> = sortNumsAscending(arr)
    for(item in ans){
        print("$item ")
    }
}