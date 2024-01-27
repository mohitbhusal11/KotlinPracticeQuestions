//Given a  string, reverse all the words which have odd length.
//The even length words are not changed.



fun slice(str:String, start:Int, end:Int):String{
    var ans = ""
    for(i in start until end){
        ans = ans + str[i]
    }
    return ans
}

fun reverseString(str:String):String{
    var ans:String = ""
    for(i in str.length-1 downTo  0){
        ans = ans + str[i]
    }
    return ans
}

fun main(){
    print("enter the sentence or word: ")
    val str:String = readLine()!!.toString()

    var arr = ArrayList<String>()

    var start = 0
    for(i in 1 until str.length){
        if(str[i] == ' '){
            val temp:String = slice(str,start,i)
            arr.add(temp)
            start = i+1
        }
    }
    val temp:String = slice(str,start,str.length)
    arr.add(temp)

    for(i in 0 until arr.size){
        var item = arr[i]
        if(item.length % 2 != 0){
            var reverseItem = reverseString(item)
            arr[i] = reverseItem
        }
    }
    var ans:String = ""
    for(i in 0 until arr.size){
        if(i == arr.size-1){
            ans = ans + arr[i]
        }
        else{
            ans = ans + arr[i] +" "
        }
    }
    println(ans)
}