//Given a sentence with numbers representing a word's location embedded within each word,
//return the sorted sentence.


fun findKey(item:String):Int{
    var ans = 0
    for(i in 0 until item.length){
        if(item[i].toInt() >= 48 && item[i].toInt() <= 57){
            ans = (item[i].toInt()) - 48
            break
        }
    }
    return ans
}

fun findKeyPair(item:String):String{
    var ans = ""
    for(i in 0 until item.length){
        if(item[i].toInt() < 48 || item[i].toInt() > 57){
            ans = ans + item[i]
        }
    }
    return ans
}

fun main(){
    print("enter the sentence: ")
    val str:String = readln().toString()
    val arr = ArrayList<String>()
    val hashmap = HashMap<Int,String>()
    var ans = ""

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

    for(item in arr){
        val key = findKey(item)
        val value = findKeyPair(item)
        hashmap[key] = value
    }

    for(i in 0 until 9){
        if(hashmap.containsKey(i)){
            ans = ans + hashmap[i] + " "
        }
    }
    if(hashmap.containsKey(9)){
        ans += hashmap[9]
    }

    println("ans --> $ans")
}