package leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _54SpiralMixKtTest {
    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(
                    arrayOf(
                        listOf(1, 2, 3).toIntArray(),
                        listOf(4, 5, 6).toIntArray(),
                        listOf(7, 8, 9).toIntArray()

                    ), listOf(1, 2, 3, 6, 9, 8, 7, 4, 5)
                ),
                Arguments.of(
                    arrayOf(
                        listOf(1, 2, 3, 4).toIntArray(),
                        listOf(5, 6, 7, 8).toIntArray(),
                        listOf(9, 10, 11, 12).toIntArray()

                    ), listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
                ),
                Arguments.of(
                    arrayOf(
                        listOf(1).toIntArray(),
                        listOf(2).toIntArray(),
                        listOf(3).toIntArray(),
                        listOf(4).toIntArray(),
                        listOf(5).toIntArray(),
                        listOf(6).toIntArray(),
                        listOf(7).toIntArray(),
                        listOf(8).toIntArray(),
                        listOf(9).toIntArray(),
                        listOf(10).toIntArray(),
                    ), listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 2, 3, 4),
                        intArrayOf(5, 6, 7, 8),
                        intArrayOf(9, 10, 11, 12),
                        intArrayOf(13, 14, 15, 16)
                    ),
                    listOf(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 11),
                        intArrayOf(2, 12),
                        intArrayOf(3, 13),
                        intArrayOf(4, 14),
                        intArrayOf(5, 15),
                        intArrayOf(6, 16),
                        intArrayOf(7, 17),
                        intArrayOf(8, 18),
                        intArrayOf(9, 19),
                        intArrayOf(10, 20)
                    ),
                    listOf(1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2)
                )
            )
    }

    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should return all matrix elements in spiral order`(matrix: Array<IntArray>, expectedSpiral: List<Int>) {
        assertEquals(expectedSpiral, spiralOrder(matrix))
    }
}