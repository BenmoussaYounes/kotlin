fun main(args: Array<String>) {
    val ali : PersonModel = Student()
}

abstract class PersonModel {
    val personName : String = ""
    abstract fun getAge() : Int

    open fun getName() = personName
}

class Student : PersonModel(){
    fun calculateSomething(){
        getAge()
        getName()
    }

    override fun getAge() : Int {
        return 20
    }


}

interface  Person2 {
     fun getAge(): Int

     val personName : String

     fun getSomething() : String {
         return ":D"
     }

}


class Teacher : Person2{
    override fun getAge(): Int {
        TODO("Not yet implemented")
    }

    override val personName: String = "Younes"

    override  fun getSomething() =  super.getSomething()
}

class Director : PersonModel(), Person2 {

    override fun getAge() = 45

    fun example() = super<Person2>.getSomething()
}
