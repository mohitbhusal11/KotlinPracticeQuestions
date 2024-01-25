//You have a pack of 5 randomly numbered cards, which can range from 0-9.
//You can win if you can produce a higher two-digit number from your cards than your opponent.
//Return true if your cards win that round.



fun findMaxTwoDigitNumber(arr:Array<Int>):Int{
    var max = 0
    var max2 = 0
    for(i in 0 until arr.size){
        if(max < arr[i]){
            max = arr[i]
        }
    }
    for(i in 0 until arr.size){
        if(max2 < arr[i] && arr[i] != max){
            max2 = arr[i]
        }
    }
    return (max*10) + max2
}

fun winRound(myArr:Array<Int>, oppArr:Array<Int>):Boolean{
    val myNumber = findMaxTwoDigitNumber(myArr)
    val oppNumber = findMaxTwoDigitNumber(oppArr)
    println("myNumber --> $myNumber \noppNumber --> $oppNumber")
    return myNumber > oppNumber
}

fun main(){
//    var myArr:Array<Int> = arrayOf(2,5,2,6,9)
//    var oppArr:Array<Int> = arrayOf(3,7,3,1,2)
    print("enter the size of array: ")
    val arrSize = readLine()!!.toInt()
    var myArr = Array<Int>(arrSize){0}
    var oppArr = Array<Int>(arrSize){0}

    println("enter the element of My array: ")
    for(i in 0 until arrSize){
        myArr[i] = readLine()!!.toInt()
    }

    println("enter the element of opponent array: ")
    for(i in 0 until arrSize){
        oppArr[i] = readLine()!!.toInt()
    }

    println(winRound(myArr,oppArr))
}