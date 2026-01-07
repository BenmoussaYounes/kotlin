import java.util.*

fun main(args: Array<String>) {

    val numbers  = intArrayOf(1,2,3)
    val alphabets  = arrayOf("a","b","c")
    val al = Array(100) {it}

    print(Arrays.toString(al))

    numbers.forEach {  println(it) }

    print(numbers.get(1))
    print(numbers[1])
    numbers[1] = 8
    numbers.set(1, 2)

}