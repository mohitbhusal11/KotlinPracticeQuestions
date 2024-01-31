import java.util.*
import kotlin.collections.ArrayList


//-----------------using of comparable is in 2nd part of comparable2-------------------
fun main(){
    var listOfNames = ArrayList<String>()
    listOfNames.add("mohit")
    listOfNames.add("fohit")
    listOfNames.add("dohit")
    listOfNames.add("eohit")
    listOfNames.add("rohit")

    println("before sort")
    for(name in listOfNames){
        println(name)
    }
    println("after sort")
    Collections.sort(listOfNames)
    for(name in listOfNames){
        println(name)
    }
    println("using sort()")
    listOfNames.clear()
    listOfNames.add("mohit")
    listOfNames.add("fohit")
    listOfNames.add("dohit")
    listOfNames.add("eohit")
    listOfNames.add("rohit")
    listOfNames.sort()
    for(name in listOfNames){
        println(name)
    }
}