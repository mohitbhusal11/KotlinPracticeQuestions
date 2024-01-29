//Create a function that converts 12-hour time to 24-hour time or vice versa.
//Return the output as a string.

fun checkSuffix(time:String):Boolean{
    if(time[time.length-1] == 'm'){
        return true
    }
    return false
}

fun convertTimeIntoDigit(time: String):Double{
    var hour:Double = 0.0
    var minute:Double = 0.0
    var breakIndex = 0
    for(i in 0 until time.length){
        if(time[i] == ':'){
            breakIndex = i
            break
        }
        hour = (hour*10) + time[i].toInt() - 48
    }
    for(i in breakIndex+1 until time.length){
        if(time[i] == ' '){
            break
        }
        minute = (minute*10) + time[i].toInt() - 48
    }
    var ans = hour + minute/100

    return ans
}

fun convertTime(time: String):String{
    var ans = ""
    if(time[time.length-2] == 'a'){
        var timeInDigit = convertTimeIntoDigit(time)
        var updateTime = timeInDigit - 12.00
        ans += updateTime.toString() + '0'
    }else{
        var timeInDigit = convertTimeIntoDigit(time)
        var updateTime = timeInDigit + 12.00
        ans += updateTime.toString() + '0'
    }
    return ans
}

fun convert25HoursTime(time: String):String{
    var ans = ""
    var timeInDigit = convertTimeIntoDigit(time)
    if(timeInDigit > 12){
        var updateTime = timeInDigit - 12.00
        ans += updateTime.toString() + '0' + " pm"
    }
    else{
        ans += timeInDigit.toString() + " am"
    }
    return ans
}

fun main(){
    print("enter the time: ")
    val time:String = readLine()!!.toString()
    var ans = ""
    var result = ""
    if(checkSuffix(time)){
        ans = convertTime(time)
    }else{
        ans = convert25HoursTime(time)
    }
    for(i in 0 until ans.length){
        if(ans[i] == '.'){
            result += ':'
        }else{
            result += ans[i]
        }
    }
    println("ans --> $result")
}