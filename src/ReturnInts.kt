//Write a function that takes an array of elements and returns only the ints.


fun checkThis(item:String):Boolean{
    for(i in 0 until item.length){
        if(item[i].toInt() < 48 || item[i].toInt() > 57){
            return false
        }
    }
    return true
}

fun findValue(item:String):Int{
    var ans = 0
    for(i in 0 until item.length){
        val tempVal = (item[i].toInt()) - 48
        ans = (ans*10) + tempVal
    }
    return ans
}

fun returnInts(arr:Array<String>):ArrayList<Int>{
    var ans = ArrayList<Int>()
    for(item in arr){
//        if(item.length > 1){
            if(checkThis(item)){
                val tempVal = findValue(item)
                ans.add(tempVal)
            }
//        }
//        else{
//            if(item.toInt() >=48 && item.toInt() <= 57){
//                val tempVal = (item.toInt()) - 48
//                ans.add(tempVal)
//            }
//        }
    }
    return ans
}

fun main(){
    print("enter array size: ")
    val arraySize = readLine()!!.toInt()

    val arr:Array<String> = Array<String>(arraySize){""}
    println("enter the elements of the array")
    for(i in 0 until arraySize){
        print("enter the $i index element: ")
        arr[i] = readLine()!!.toString()
    }

    val ans:ArrayList<Int> = returnInts(arr)

    println("prining ans arrray")
    for(item in ans){
        print("$item ")
    }
}