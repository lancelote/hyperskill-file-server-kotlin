package stage1.hw4

import java.util.stream.Stream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class MainTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun reverse(input: Int?, expected: Int) {
        assertEquals(expected, reverse(input))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(null, -1),
            Arguments.of(654, 456),
        )
    }
}
