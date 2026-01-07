fun main(args: Array<String>) {
    for(number in 1..100){
        println(number)
    }

    for(number in 1 until 100){
        println(number)
    }

    for(number in 1 until 100 step 3){
        println(number)
    }

    for(number in 100 downTo 1 step 3){
        println(number)
    }

    // number can not be used outside for scoop

    val alphabet = listOf("a","b","c")
    for(letter in alphabet){
        println(letter)
    }

    for((index, letter) in alphabet.withIndex()){
        if(index ==1)
            continue
        else
        println("$index $letter")
    }

}