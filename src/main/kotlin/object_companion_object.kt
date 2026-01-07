import java.awt.event.MouseAdapter
import java.awt.event.MouseMotionListener

fun main(args: Array<String>) {

    Factory.getString()

    val helloWorld = HelloWorld.Factory.createHelloWorld()

    helloWorld.getHello()

    HelloWorld.getWorld()


    val annonymosObj =  object : MouseAdapter(){
    }


}




// Singleton Design Pattern
object  Factory {
    fun getString() = "Hello"
}

class HelloWorld private constructor(){
    fun getHello() = "Something" + getWorld()

companion object {
    // static fn :D
    fun getWorld() = 26
}

    object Factory {
        fun createHelloWorld() = HelloWorld()
    }

}