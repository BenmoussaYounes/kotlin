fun main(args: Array<String>) {
    var car = Car("Golf8", 2023)
    println(car.toString())

    val car2 = car.copy(year = 2025)
    println(car)

    val (name, year) = car2
    println(name)
    println(year)
}


data class Car(val name : String, val year: Int){
// toString - hashCode - copy - equals

    val mode = ":D"
}