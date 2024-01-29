//Write a function that calculates overtime and pay associated with overtime.
//Form Questions PDF 30 TO 49 -> page number 18

fun main(){
    print("enter check in  time: ")
    //if you want to create array you have to use toDouble datatype array
    var start = readLine()!!.toDouble()
    print("enter check out time: ")
    var end = readLine()!!.toDouble()
    print("enter hourly rate: ")
    var regularPay = readLine()!!.toDouble()
    print("enter overtime multiplier: ")
    val overPay = readLine()!!.toDouble()

    var ans:Float
    val regularTime = end - start
    val extra = end - 17
    if(extra < 0){
        ans = (regularTime * regularPay).toFloat()
    }else{
        if(regularTime > extra){
            ans = (((regularTime-extra) * regularPay) + (extra * regularPay * overPay)).toFloat()
        }
        else{
            ans = (((extra-regularTime) * regularPay) + (extra * regularPay * overPay)).toFloat()
        }
    }
    print("ans -> $ans")
}