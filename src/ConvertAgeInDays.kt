//Create a function that takes the age in years and returns the age in days


fun convertYearInDays(ageInYear:Int):Int{
    return (ageInYear * 365)
}

fun main(){
    print("enter your age: ")
    val ageInYear = readLine()!!.toInt()

    val ageInDays = convertYearInDays(ageInYear)
    println("your age $ageInYear years is equal to $ageInDays days")
}