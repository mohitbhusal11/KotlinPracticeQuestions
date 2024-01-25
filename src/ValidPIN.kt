//Create a function that will test if a string is a valid PIN or not via a regular expression

//A valid PIN has
// -> Exactly 4 or 6 characters.
// -> Only numeric characters (0-9).
// -> No whitespace

//-----------------------------------------------------using for loop and .isDigit() funtion------------------------------------------------
//for (char in pin) {
//    if (!char.isDigit()) {
//        return false
//    }
//}
//return true

//----------------------------------------------------using for loop and conditions-------------------------------------------------------------------

//        for(i in 0 until pin.length){
////            if(pin[i] == '0' || pin[i] == '1' || pin[i] == '2' || pin[i] == '3' || pin[i] == '4' || pin[i] == '5' || pin[i] == '6' || pin[i] == '7' || pin[i] == '8' || pin[i] == '9' ){
////                continue
////            }
////            else{
////                return false
////            }
//        }



fun validatePIN(pin:String):Boolean{
    if(pin.length == 4 || pin.length == 6){
//      ---------------------------------------------------using .all and isDigit function-------------------------------------------------------------
        var ans:Boolean = pin.all {char -> char.isDigit()}
        return ans
    }
    else{
        return false
    }
    return true
}

fun main(){
    print("enter the PIN: ")
    val pin:String = readLine()!!.toString()

    println(validatePIN(pin))
}