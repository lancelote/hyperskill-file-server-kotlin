package stage1.hw3

import java.util.Scanner    // required import

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)  // Scanner for user input

    val str = "Learning Kotlin"   // Given constant string
    val lengthOfSubstring: Int    // Variable to store the given number (length of substring)

    lengthOfSubstring = input.nextInt()

    if (lengthOfSubstring > str.length) {
        println("Out of range")
    } else {
        println(str.substring(0, lengthOfSubstring))
    }
}
