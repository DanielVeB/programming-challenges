package leetcode.algorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class _42MultiplyStringsKtTest {
    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> =
            Stream.of(
                Arguments.of("0", "0", "0"),
                Arguments.of("1", "1", "1"),
                Arguments.of("2", "2", "4"),
                Arguments.of("5324321", "453232", "2413152655472"),
                Arguments.of("5324321000000001", "453232", "2413152655472000453232"),
                Arguments.of("123456789", "987654321", "121932631112635269"),
                Arguments.of("11", "11", "121"),
                Arguments.of("987", "888", "876456"),
                Arguments.of(
                    "1241234332095843293483243219438539203495234238939853487694543685454364586398458363634959386345439946436343096943630695",
                    "4325226434500000000095435348539643594906503459654043594069534039695439348643956943698435435722543543",
                    "536861954458989320066172278661139254218277501749025309245559033797028000235922109538222036862228821" +
                            "8394734191464364779436932849651226408937249206813243095297819409174630600296033996017343917188082825170920718648852385"
                )

            )
    }

    @ParameterizedTest
    @MethodSource("generateData")
    fun `Should multiply 2 strings`(num1: String, num2: String, exptected: String) {
        assertEquals(exptected, multiply(num1, num2))
    }

    @Test
    fun `Should multiply by 1 digit`() {
        assertEquals("12", multipleOneDigit("6", 2, 0))

        assertEquals("12864", multipleOneDigit("6432", 2, 0))

        assertEquals("7896", multipleOneDigit("987", 8, 0))
        assertEquals("78960", multipleOneDigit("987", 8, 1))
        assertEquals("789600", multipleOneDigit("987", 8, 2))
    }


    @Test
    fun `Should sum 2 strings`() {
        assertEquals("432", sum("400", "32"))
        assertEquals("424", sum("0412", "12"))
        assertEquals("1998", sum("999", "999"))

    }
}