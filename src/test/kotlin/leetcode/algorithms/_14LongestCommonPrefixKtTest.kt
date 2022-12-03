package leetcode.algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _14LongestCommonPrefixKtTest{

    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(arrayOf("flower","flow","flight"), "fl"),
                Arguments.of(arrayOf(""), ""),
                Arguments.of(arrayOf("a","b","c"), ""),
                Arguments.of(arrayOf("a"), "a"),
                )
    }

    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should return longest common prefix`(words: Array<String>, expectedPrefix: String) {
        assertEquals(expectedPrefix, longestCommonPrefix(words))
    }
}