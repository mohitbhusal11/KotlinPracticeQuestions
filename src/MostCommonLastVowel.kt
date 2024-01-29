//Create a function that takes in a sentence as input and returns the most common last vowel in the sentence as a single character string.


fun commonLastVowel(sentence:String):String{
    for(i in sentence.length-1 downTo 0){
        when(sentence[i]){
            'a' -> return "a"
            'e' -> return "e"
            'i' -> return "i"
            'o' -> return "o"
            'u' -> return "u"
        }
    }
    return ""
}

fun main(){
    print("enter the sentence: ")
    var sentence = readLine()!!.toString()
    val lowerSentence = sentence.lowercase()
    var ans = commonLastVowel(lowerSentence)
    println("ans --> $ans")
}