//Create a method that takes a string as its argument and returns the string in reversed order.

//------------using extension------------------
fun String.reverseString():String{
    var ans = ""
    for(i in this.length-1 downTo 0){
        ans = ans + this[i]
    }
    return ans
}
//----------------------------------------------
fun main(){
    print("enter the string: ")
    var str:String = readLine()!!.toString()
    val ans = str.reverseString()
    println("ans --> $ans")
}