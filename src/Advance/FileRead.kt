package Advance

import java.io.FileReader
import java.io.FileWriter


fun main(){
    readFromFle()
}

fun readFromFle(){
    try {
        var fin = FileReader("C:\\Users\\hp\\IdeaProjects\\KotlinPracticeQuestions\\src\\Advance\\test.txt")
        var c:Int?
        do{
            c = fin.read()
            print(c.toChar())
        }while(c!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}