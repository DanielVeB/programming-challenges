package leetcode.algorithms

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class _1706BallFallKtTest {

    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(
                    arrayOf(
                        listOf(1, 1, 1, -1, -1).toIntArray(),
                        listOf(1, 1, 1, -1, -1).toIntArray(),
                        listOf(-1, -1, -1, 1, 1).toIntArray(),
                        listOf(1, 1, 1, 1, -1).toIntArray(),
                        listOf(-1, -1, -1, -1, -1).toIntArray()
                    ),
                    listOf(1, -1, -1, -1, -1).toIntArray()
                ),
                Arguments.of(
                    arrayOf(
                        listOf(1, 1, 1, 1, 1, 1).toIntArray(),
                        listOf(-1, -1, -1, -1, -1, -1).toIntArray(),
                        listOf(1, 1, 1, 1, 1, 1).toIntArray(),
                        listOf(-1, -1, -1, -1, -1, -1).toIntArray()
                    ),
                    listOf(0, 1, 2, 3, 4, -1).toIntArray()
                )
            )
    }

    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should return array with column where ball will fall`(grid: Array<IntArray>, expected: IntArray) {
        assertTrue(expected contentEquals findBall(grid))
    }
}