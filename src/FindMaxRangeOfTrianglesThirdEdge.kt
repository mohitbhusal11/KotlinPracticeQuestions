//Create a function that finds the maximum range of a triangle's third edge,
//where the side lengths are all integers


fun findThirdSide(side1:Int, side2:Int):Int{
    val side3 = (side1 + side2) -1
    return side3
}

fun main(){
    print("enter side 1 length: ")
    val side1 = readLine()!!.toInt()
    print("enter side 2 length: ")
    val side2 = readLine()!!.toInt()

    println("side 3 length: "+findThirdSide(side1,side2))
}