//Write a function that, given the start "starNum" and end "endNum" values, return an array containing all the numbers inclusive to that range.


fun inclusiveArray(start:Int, end:Int){
    var tempStart = start
    if(tempStart > end){
        return
    }
    print("$tempStart ")
    tempStart += 1
    inclusiveArray(tempStart,end)
}

fun main(){
    print("enter start Number: ")
    var start = readLine()!!.toInt()
    print("enter end Number: ")
    val end = readLine()!!.toInt()
    if(start > end){
        print(start)
    }else{
        inclusiveArray(start,end)
    }
}