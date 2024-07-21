package stage1.hw2

import java.lang.Exception
import java.lang.NumberFormatException

fun stringToIntLength(input: String): Int {
    try {
        return input.toInt().toString().length
    } catch (e: NumberFormatException) {
        return -1
    }
}

// Entry point of the program
fun main(args: Array<String>) {
    val strInput = readLine().toString()

    // Call the previously declared function with `strInput` as an argument
    println(stringToIntLength(strInput))
}
