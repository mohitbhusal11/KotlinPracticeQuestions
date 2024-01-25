//A student learning Kotlin was trying to make a function.
//His code should concatenate a passed string "name" with string "Edabit" and store it in a variable called "result".
//He needs your help to create function


fun concatenateString(name:String):String{
    return (name + "Edabit")
}

fun main(){
    print("enter name: ")
    val name:String = readLine()!!.toString()

    val result = concatenateString(name)
    println(result)
}