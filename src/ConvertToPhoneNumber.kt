//Create a program that converts a phone number with letters to one with only numbers.


fun findPhoneNumberDigit(phoneNumber: Char):Int{
    when(phoneNumber){
        'A','B','C' -> return 2
        'D','E','F' -> return 3
        'G','H','I' -> return 4
        'J','K','L' -> return 5
        'M','N','O' -> return 6
        'P','Q','R','S' -> return 7
        'T','U','V' -> return 8
        'W','X','Y','Z' -> return 9

    }
    return 0
}

fun updatePhoneNumber(phoneNumber:String):String{
    var ans = ""
    for(i in 0 until phoneNumber.length){
        if(phoneNumber[i].toInt() >= 65 && phoneNumber[i].toInt() <= 90 ){
            val tempDigit:Int = findPhoneNumberDigit(phoneNumber[i])
            ans = ans + tempDigit.toString()
        }
        else{
            ans = ans + phoneNumber[i]
        }
    }
    return ans
}

fun main(){
    print("enter the phone numberL: ")
    var phoneNumber:String = readLine()!!.toString()

    val updatedPhoneNumber = updatePhoneNumber(phoneNumber)
    println("converted phone number: $updatedPhoneNumber")
}