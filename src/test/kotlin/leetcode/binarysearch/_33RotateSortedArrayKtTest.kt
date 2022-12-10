package leetcode.binarysearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _33RotateSortedArrayKtTest {

    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
//                Arguments.of(
//                    intArrayOf(4, 5, 6, 7, 0, 1, 2), 0, 4
//                ),
//                Arguments.of(
//                    intArrayOf(4, 5, 6, 7, 0, 1, 2), 3, -1
//                ),
//                Arguments.of(
//                    intArrayOf(1, 3), 2, -1
//                ),
//                Arguments.of(
//                    intArrayOf(8, 9, 2, 3, 4), 9, 1
//                ),
//                Arguments.of(
//                    intArrayOf(4, 5, 6, 7, 0, 1, 2), 5, 1
//                ),
                Arguments.of(
                    intArrayOf(7,8,1,2,3,4,5,6), 2, 3
                ),
                )
    }


    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should find index of target`(nums: IntArray, target: Int, expected: Int) {
        assertEquals(expected, search(nums, target))
    }
}