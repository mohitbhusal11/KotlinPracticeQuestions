import kotlin.contracts.Returns

//Create a function that determines the minimum number of characters needed to make a strong password.
//A password is considered strong if it satisfies the following criteria.
//-> its length is at least 6.
//-> it contains at least one digit
//-> it contains at least one lowercase English character.
//-> it contains at least one uppercase English character.
//-> it contains at least one special character


fun checkNumber(pass:String):Int{
    for(i in 0 until pass.length){
        if(pass[i].toInt() >= 48 && pass[i].toInt() <= 57){
            return 1
        }
    }
    return 0
}

fun checkLowerCase(pass:String):Int{
    for(i in 0 until pass.length){
        if(pass[i].toInt() >= 97 && pass[i].toInt() <= 122){
            return 1
        }
    }
    return 0
}

fun checkUpperCase(pass:String):Int{
    for(i in 0 until pass.length){
        if(pass[i].toInt() >= 65 && pass[i].toInt() <= 90){
            return 1
        }
    }
    return 0
}

fun checkSpecialChar(pass:String):Int{
    for(i in 0 until pass.length){
        when(pass[i].toInt()){
            33 -> return 1
            35,36,37,38 -> return 1
            40,41,42,43 -> return 1
            45 -> return 1
            64 -> return 1
            94 -> return 1
        }
    }
    return 0
}
//33
//35 - 38
//40 - 43
//45
//64
//94

fun strongPassword(pass:String):Int{
    var ans = 0
    val num = checkNumber(pass)
    val lower_case = checkLowerCase(pass)
    val upper_case = checkUpperCase(pass)
    val special = checkSpecialChar(pass)
    ans = num + lower_case + upper_case + special
    return ans
}

fun main(){
    print("enter password: ")
    val password = readLine()!!.toString()

    val ans = strongPassword(password)
    if(password.length >= 6 && ans == 4){
        print("ans -> " + 0)
    }
    else if(password.length < 6){
        print("ans -> ${6 - password.length}")
    }
    else if(password.length >= 6 && ans < 4){
        print("ans -> ${4-ans}")
    }
}