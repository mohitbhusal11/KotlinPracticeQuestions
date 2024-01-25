//Write a function that takes an integer minutes and converts it to seconds


fun convertIntoSeconds(minutes:Int):Int{
    return minutes * 60
}
fun main(){
    print("enter minutes: ")
    val minutes:Int = readLine()!!.toInt()
    val ans = convertIntoSeconds(minutes)
    println("$minutes minutes is equal to $ans seconds")
}