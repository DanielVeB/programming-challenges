package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _74Search2DMatrixKtTest {

    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(4, 5, 6),
                        intArrayOf(7, 8, 9)
                    ), 5, true
                ),
                Arguments.of(
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(4, 5, 6),
                        intArrayOf(7, 8, 9)
                    ), 99, false
                ))
    }


    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should find element in matrix`(matrix: Array<IntArray>, target: Int, expected: Boolean) {
        assertEquals(expected, searchMatrix(matrix, target))
    }
}