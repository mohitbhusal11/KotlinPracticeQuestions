//Create a function that takes a string and returns a string ordered by the length of the words.
//From shortest to longest word.
//If there are words with the same amount of letters, order them alphabetically.


//fun compareThis(strI:String,strJ:String):Boolean{
//    for(i in 0 until strI.length){
//        if(strI[i].toChar().toInt() > strJ[i].toChar().toInt()){
//            return true
//        }
//    }
//    return false
//}

fun arraySort(arr:ArrayList<String>){
    for(i in 0 until arr.size){
        val tempSize = arr[i].length
        for(j in 0 until arr.size){
            if(tempSize < arr[j].     length){
                val tempStr = arr[j]
                arr[j] = arr[i]
                arr[i] = tempStr
            }
//            else if(tempSize == arr[j].length){
////                if(compareThis(arr[i],arr[j])){
////                    val tempStr = arr[j]
////                    arr[j] = arr[i]
////                    arr[i] = tempStr
////                }
//            }
        }
    }
}

fun convertArrayIntoString(arr:ArrayList<String>):String{
    var ans = ""
    for(i in 0 until arr.size-1){
        ans = ans + arr[i] + " "
    }
    ans = ans + arr[arr.size-1]
    return ans
}

fun main(){
    print("enter the string: ")
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

    arraySort(arr)
    val ans = convertArrayIntoString(arr)
    println("ans -> $ans")
}