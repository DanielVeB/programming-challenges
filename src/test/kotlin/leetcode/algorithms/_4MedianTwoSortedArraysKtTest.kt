package leetcode.algorithms

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _4MedianTwoSortedArraysKtTest {

    companion object {
        @JvmStatic
        fun generateMediumData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(
                    listOf<Int>().toIntArray(),
                    listOf(1, 2, 3, 4, 5, 6).toIntArray(), 3.5
                ),
                Arguments.of(
                    listOf(1, 2, 3).toIntArray(),
                    listOf(4, 5, 6).toIntArray(), 3.5
                ),
                Arguments.of(
                    listOf(1, 3, 5).toIntArray(),
                    listOf(2, 4, 6).toIntArray(), 3.5
                ),
                Arguments.of(
                    listOf(1, 2, 3, 4, 5, 6).toIntArray(),
                    listOf<Int>().toIntArray(), 3.5
                ),
                Arguments.of(
                    listOf(1, 3).toIntArray(),
                    listOf(2).toIntArray(), 2
                ),
                Arguments.of(
                    listOf(1, 2, 3).toIntArray(),
                    listOf(2).toIntArray(), 2
                ),
                Arguments.of(
                    listOf(1, 2, 3).toIntArray(),
                    listOf<Int>().toIntArray(), 2
                ),
                Arguments.of(
                    listOf<Int>().toIntArray(),
                    listOf(1).toIntArray(), 1
                ),
                Arguments.of(
                    listOf<Int>().toIntArray(),
                    listOf(2, 3).toIntArray(), 2.5
                ),
            )
    }

    @ParameterizedTest
    @MethodSource("generateMediumData")
    fun `Should take a medium of sorted lists`(list1: IntArray, list2: IntArray, expected: Double) {
        kotlin.test.assertEquals(expected, findMedianSortedArrays(list1, list2))
    }
}