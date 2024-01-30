//Write a method that accepts two integer parameters rows and cols.
//The output is a comma-separated grid of numbers displayed in column-major order,
//meaning the numbers shown increase sequentially down each column and wrap to the top of the next column to the right once the bottom of the current column is reached.

fun main(){
    print("enter the row size: ")
    val row = readLine()!!.toInt()
    print("enter the col size: ")
    val col = readLine()!!.toInt()

    val diff = (row*col) / col

    for(i in 1 .. row){
        for(j in i .. row*col step diff){
            print("$j ")
        }
        println()
    }
}

//4 5

//1 5 9  13 17
//2 6 10 14 18
//3 7 11 15 19
//4 8 12 16 20