fun main(args: Array<String>) {
    var string = "Marhaba!"

    val biggerThenThree = string.length.takeIf { it > 3 }
    val lessThanThree = string.length.takeIf { it <3 }

    println("$biggerThenThree     $lessThanThree")

    /*
    A better way of doing this :D
    if(string.length > 3)
        val biggerThenThree = ...

     */

}