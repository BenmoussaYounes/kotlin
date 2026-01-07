fun main(args: Array<String>) {
    val person : Person = Person(firstName = "Younes", "BENMOUSSA", middleName = ":D")

    println("${person.firstName}  ${person.lastName}")
    println(person.getFullName())

}



class Person  constructor(firstName : String, lastName : String, var age: Int = 0) {
     val firstName = firstName.lowercase()
     val lastName = lastName.lowercase()

    init {
        age = 10
    }

    constructor(firstName : String, lastName : String, middleName : String ) : this(firstName, lastName){
    }

    fun getFullName() = "$firstName  $lastName"
}