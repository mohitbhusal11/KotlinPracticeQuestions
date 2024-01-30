//Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).


fun gcd(first:Int, second:Int):Int{
    if(second == 0){
        return first
    }
    return gcd(second,(first % second))
}

fun lcmOfArray(arr:Array<Int>):Int{
    var ans = arr[0]
    for(i in 1 until arr.size){
        ans = (ans*arr[i]) / gcd(arr[i],ans)
    }
    return ans
}

fun main(){
    print("enter array size: ")
    val size = readLine()!!.toInt()
    val arr:Array<Int> = Array<Int>(size){0}
    println("enter the array elements")
    for(i in 0 until size){
        print("enter the index $i element: ")
        arr[i] = readLine()!!.toInt()
    }

    val ans = lcmOfArray(arr)
    println("ans --> $ans")
}