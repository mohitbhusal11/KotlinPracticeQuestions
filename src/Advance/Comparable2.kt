package Advance

import java.util.Collections

class Person(var name:String, var age:Int):Comparable<Person>{
    override fun compareTo(other: Person):Int{
        return this.age - other.age //it will return positive and negative and zero
        //positive means this.age is big and other.age is small
        //negative means this.age is small and other.age is big
        //zero means this.age and other.age have same age
    }
}

fun main(){
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("mohit",22))
    listOfNames.add(Person("rohit",27))
    listOfNames.add(Person("fohit",26))
    listOfNames.add(Person("gohit",23))
    listOfNames.add(Person("hohit",24))

    println("before sort")
    for(person in listOfNames){
        println("name: ${person.name} age: ${person.age}")
    }
    println("after sort")
    Collections.sort(listOfNames)
    for(person in listOfNames){
        println("name: ${person.name} age: ${person.age}")
    }
}