//Create a function which takes in an encoded string and returns an object according to the following example.


fun parseCode(str:String){
    val arr = ArrayList<String>()
    var tempItem = ""
    for(i in 0 until str.length){
        if(str[i] == '0'){
            if(tempItem.length > 0){
                arr.add(tempItem)
            }
            tempItem = ""
        }else{
            tempItem += str[i]
        }
    }
    arr.add(tempItem) //last element because condition will not execute in for loop if else
    println("firstName - ${arr[0]},")
    println("lastName - ${arr[1]},")
    println("id - ${arr[2]}")

}

fun main(){
    print("enter the string: ")
    var str:String = readLine()!!.toString()
    parseCode(str)
}