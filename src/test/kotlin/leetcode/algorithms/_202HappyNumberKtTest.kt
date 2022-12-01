package leetcode.algorithms

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

internal class _202HappyNumberKtTest {
    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(19, true),
                Arguments.of(91, true),

                Arguments.of(2, false),
                Arguments.of(3, false),

                )
    }

    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should return true if as a happy number`(num: Int, expected: Boolean) {
        assertEquals(expected, isHappy(num))
    }
}