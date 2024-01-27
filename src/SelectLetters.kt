//Given two strings, "s1" and "s2", select only the characters in each string where the character in the same position in the other string is in uppercase.
//Return these as a single string.
//To illustrate, given the strings "s1 = "heLLo"" and "s2 = "GUlp"", we select the letters "he" from "s1", because "G" and "U" are uppercase.
//We then select "lp" from "s2", because "LL" is in uppercase. Finally, we join these together and return "help".


fun findString(first:String,second:String):String{
    var ans:String = ""
    var i = 0
    while(i < first.length && i<second.length){
        if(second[i].toInt() >= 65 && second[i].toInt() <= 90){
            ans = ans + first[i]
        }
        i += 1
    }
    return ans
}

fun main(){
    print("enter the first String: ")
    var firstString = readLine()!!.toString()
    print("enter the second String: ")
    var secondString = readLine()!!.toString()

    val firstHalf:String = findString(firstString,secondString)
    val secondHalf:String = findString(secondString,firstString)
    val ans = firstHalf + secondHalf
    println("ans --> $ans")
}