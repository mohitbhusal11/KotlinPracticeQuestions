//Create a function that will remove any repeated character(s) in a word passed to the function.
//Not just consecutive characters, but characters repeating anywhere in the string.

fun main(){
    print("enter the word: ")
    val word = readLine()!!.toString()

    val newWord = unrepeated(word)
    println("old word -> $word \nnew word -> $newWord")
}

fun unrepeated(word: String): String {
    var hashmap:HashMap<Char,Int> = HashMap<Char,Int>()
    var ans = ""
    for(i in 0 until word.length){
        var character:Char = word[i]
        hashmap.put(character,1)
    }

    println("----------> ${hashmap}")

    for(i in 0 until word.length){
        var character:Char = word[i]
        if(hashmap.containsKey(character)){
            ans = ans + character
            hashmap.remove(character)
        }
    }

    return ans
}

//hashMap.put("key", value)

