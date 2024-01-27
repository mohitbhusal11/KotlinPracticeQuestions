//Create a function that takes a string and returns the number of alphanumeric characters that occur more than once.


fun duplicateCount(str:String):Int{
    var ans = 0
    var hashmap:HashMap<Char,Int> = HashMap<Char,Int>()
    for(i in 0 until str.length){
        if(str[i] == ' '){
            continue
        }
        if(hashmap.containsKey(str[i])){
            var tempVal = hashmap[str[i]]
            tempVal = tempVal!! + 1
            hashmap[str[i]] = tempVal
        }
        else{
            hashmap[str[i]] = 1
        }
    }

    for(pair in hashmap){
        if(hashmap[pair.key]!! > 1){
            ans = ans + 1
        }
    }

    return ans
}

fun main(){
    print("enter the string: ")
    val str:String = readLine()!!.toString()

    val ans = duplicateCount(str)
    println("ans --> $ans")
}