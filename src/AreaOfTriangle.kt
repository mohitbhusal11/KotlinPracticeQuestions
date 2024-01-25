//Write a function that takes the base and height of a triangle and return its area


fun areaOfTriangle(base:Int, height:Int):Int{
    val area = (base * height)/2
    return area
}

fun main(){
    print("enter the base: ")
    val base = readLine()!!.toInt()
    print("enter the height: ")
    val height = readLine()!!.toInt()

    val area = areaOfTriangle(base, height)
    println("area of triangle of $base base and $height height --> $area")
}