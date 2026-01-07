fun main(args: Array<String>) {

    val number = 17

    // More Powerfully switch :D
    when(number){
        10-> println("10")
        25 -> println("25")
        5 ->{
            println("5")
        }
        1,2,3-> println("1,2,3")

        !in 1..100 ->print("In range 1 - 100")

        17 -> println("17")
        17 -> println("17")

        else -> print("Hola")
    }

   val result =  when {
        number > 15 -> print("")

        "___".isEmpty() -> println("")

        else -> println("Marhaba")
    }

    println("Result $result")
}


fun something(x: Int) = when(x){
        in 1..100 -> 7
        in 5..100 ->8
        else -> 87
}