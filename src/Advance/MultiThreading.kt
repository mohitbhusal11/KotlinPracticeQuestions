package Advance

fun main(){
    var t1 = thread("thread 1")
    t1.start()

    var t2 = thread("thread 2")
    t2.start()
    var t3 = thread("thread 3")
    t3.start()

    t1.join() //this is used so that the below code execute after the thread complete
    println("thread is run")
}

class thread():Thread(){ //now this is a thread class
    var threadName = ""
    constructor(ThreadName:String):this(){
        this.threadName = ThreadName
        println("${this.threadName} is started")
    }
    override fun run(){
        //write thread
        var count = 0
        while(count < 10){
            println("$threadName: $count")
            count++
            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}