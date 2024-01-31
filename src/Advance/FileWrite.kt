package Advance

import java.io.FileWriter


fun main(){
    fileWrite("Hello World")
}

fun fileWrite(str:String){
    try {
        var fwrite = FileWriter("C:\\Users\\hp\\IdeaProjects\\KotlinPracticeQuestions\\src\\Advance\\test.txt")
        fwrite.write(str+ "\n")
        fwrite.close()
        print(("file write complete"))
    }catch (ex:Exception){
        println(ex.message)
    }
}
