//Create a function that finds how many prime numbers there are, up to the given integer.


fun isPrime(num:Int):Boolean{
    for(i in 2..num){
        if(num != i && num%i == 0){
            return false
        }
    }
    return true
}

fun totalPrimeNumbers(num:Int):ArrayList<Int>{
    var arr = ArrayList<Int>()
    for(i in 2..num){
        if(isPrime(i)){
            arr.add(i)
        }
    }
    return arr
}

fun main(){
    print("enter the number: ")
    val number = readLine()!!.toInt()

    if(number < 2){
        println("number should be greater or equal to 2")
    }

    var primeNumbers:ArrayList<Int> = totalPrimeNumbers(number)

    println("all the prime numbers are:")
    for(i in 0 until primeNumbers.size){
        print("${primeNumbers[i]} ")
    }
}