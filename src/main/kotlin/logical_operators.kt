fun main(args: Array<String>) {
    // Structural Equality
    if( 5 == 5){
        println("True")
    } else {
        println("False")
    }

    if(5 != 7 && 4==8){
        print(":D")
    }

    if(5==8 || 7 == 7)
        print(":)")

    // Referential Equality
    val a = Integer(5)
    val b = Integer(5)
    val c = a

    if(a === b){
        print("a === b")
    }

    if(a === c){
        print("a === c")
    }
}