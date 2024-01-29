//Create function that takes in a number as a string "n" and returns the number without trailing and leading zeros.

fun main(){
    print("enter the number: ")
    val str:String = readLine()!!.toString()
    var ans = ""
    var dotIndex = -1
    var leadingZeroIndex = -1
    var trailingZeroIndex = -1

    for(i in 0 until str.length){
        if(str[i] == '.'){
            dotIndex = i
            break
        }
    }

    for(i in 0 until str.length){
        if(i == dotIndex){
            break
        }
        if(str[i] != '0'){
            leadingZeroIndex = i
            break
        }
    }

    for(i in str.length-1 downTo 0){
        if(i == dotIndex){
            trailingZeroIndex = dotIndex
            break
        }
        if(str[i] != '0' || dotIndex < 0){
            trailingZeroIndex = i
            break
        }
    }

    if(dotIndex < 0){
        for(i in leadingZeroIndex .. trailingZeroIndex){
            ans += str[i]
        }
    }else{

//        for(i in leadingZeroIndex until trailingZeroIndex){
//            if(dotIndex == i){
//                ans += '.'
//            }else{
//                ans += str[i]
//            }
//        }

        for(i in leadingZeroIndex until dotIndex){
            ans += str[i]
        }
        if(dotIndex != -1){
            ans += '.'
        }
        for(i in trailingZeroIndex downTo dotIndex){
            ans += str[i]
        }
    }
    print("ans --> $ans")
}