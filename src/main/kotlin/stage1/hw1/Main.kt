package stage1.hw1

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val strNumber = readln()

    try {
        strNumber.toInt()
        println("Operation successful")
    } catch (e: NumberFormatException) {
        println("Operation failed: Non-numeric string")
    } catch (e: Exception) {
        println("Operation failed: Unexpected error")
    }
}
