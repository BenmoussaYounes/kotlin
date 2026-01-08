fun main(args: Array<String>) {
    println(isStringDigitOnly1("12455"))
    println("1548zzz".isStringDigitOnly())

}


fun isStringDigitOnly1(string:String) : Boolean {
    string.forEach {
        if(!it.isDigit() ) return false
    }
    return true;
}

fun String.isStringDigitOnly() : Boolean {
    this.forEach {
        if(!it.isDigit() ) return false
    }
    return true;
}