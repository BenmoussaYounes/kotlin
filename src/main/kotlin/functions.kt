fun main(args: Array<String>) {


    println(add(5,5).minus(1))

    println(multiply(2,2))

    println(minus(z = 10))
}


fun add(a : Int, b : Int) : Int {
    // a = 0 Error ! Params are immutable
    val c = 1 // C is available here only ( on the fn scope only)
   return a + b
}


fun multiply(x: Int, y: Int) = x * y


fun minus(x: Int = 5, y : Int = 5, z : Int = 5) : Int {
    return (x + y) - z
}