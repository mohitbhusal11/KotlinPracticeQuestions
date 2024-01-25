//Given an array of integers, return the largest gap between the sorted elements of the array.


fun largestGap(arr:Array<Int>):Int{
    var ans = 0
    for(i in 0 until arr.size-1){
        val temp = arr[i+1] - arr[i]
        if(temp > ans){
            ans = temp
        }
    }
    return ans
}

fun main(){
    print("enter the size of array: ")
    val arrSize = readLine()!!.toInt()
    var arr = Array<Int>(arrSize){0}
    for(i in 0 until arrSize){
        arr[i] = readLine()!!.toInt()
    }
    arr.sort()

    println("Largest Gap between array: " + largestGap(arr))

}