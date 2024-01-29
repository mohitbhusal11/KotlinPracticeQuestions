//Write a function that swaps the first pair (1st and 2nd characters) with the second pair (3rd and 4th characters) for every quadruplet substring

fun main(){
    print("enter the string: ")
    var str:String = readLine()!!.toString()
    var arr = ArrayList<Char>()
    var ans = ""
    for(i in 0 until str.length){
        arr.add(str[i])
    }

    var i = 0
    while(i <= arr.size-4){
        var firstPair1 = arr[i]
        var firstPair2 = arr[i+1]
        var secondPair1 = arr[i+2]
        var secondPair2 = arr[i+3]

        arr[i] = secondPair1
        arr[i+1] = secondPair2
        arr[i+2] = firstPair1
        arr[i+3] = firstPair2

        i += 4
    }

    for(i in 0 until arr.size-1){
        ans += arr[i] + " "
    }

    ans += arr[arr.size-1]
    print("ans --> $ans")
}