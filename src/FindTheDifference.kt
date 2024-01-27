//You are given two strings "s" and "t".
//String "t" is generated by randomly shuffling string "s" and then adding one more letter at a random position.
//Return the letter that was added to "t".

fun main(){
    print("enter s string: ")
    val firstStr = readLine()!!.toString()
    print("enter t string: ")
    val secondStr = readLine()!!.toString()

    var ans:String = ""

    val hashmap:HashMap<Char, Int> = HashMap<Char, Int>()
    for(i in 0 until secondStr.length){
        if(hashmap.containsKey(secondStr[i])){
            val value = hashmap[secondStr[i]]
            hashmap[secondStr[i]] = value!! + 1
        }
        else{
            hashmap[secondStr[i]] = 1
        }
    }

    for(i in 0 until firstStr.length){
        if(hashmap.containsKey(firstStr[i])){
            if(hashmap[firstStr[i]]!! > 1){
                val value = hashmap[firstStr[i]]
                hashmap[firstStr[i]] = value!! - 1
            }
            else{
                hashmap.remove(firstStr[i])
            }
        }
    }

    for(pair in hashmap){
        ans = pair.key.toString()
    }
    println("ans --> $ans")
}