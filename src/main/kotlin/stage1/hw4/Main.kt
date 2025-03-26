package stage1.hw4

fun reverse(input: Int?): Int {
    return input?.toString()?.reversed()?.toIntOrNull() ?: -1
}
