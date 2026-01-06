fun main(args: Array<String>) {

    val number = 17

    if(number>16)
        println("hello")
    else
        println("Hola")


    // if and else are expressions on kotlin
    val value = if(number > 10) 1 else 2

    print("Somthing ${if (number>2) 1 else 5}")
}