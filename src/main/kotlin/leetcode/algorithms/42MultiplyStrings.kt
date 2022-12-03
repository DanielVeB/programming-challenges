package leetcode.algorithms

fun multiply(num1: String, num2: String): String =
    num2.toCharArray().mapIndexed { index, c ->
        multipleOneDigit(num1, c.digitToInt(), num2.length - index - 1)
    }.foldRight("") { op, acc -> sum(op, acc) }


fun sum(num1: String, num2: String): String {
    return ("0$num1").zip("0".repeat(num1.length + 1 - num2.length) + num2)
        .foldRight(Pair("", 0)) { op, acc ->
            val s = op.first.digitToInt() + op.second.digitToInt() + acc.second
            Pair("${s % 10}${acc.first}", s / 10)
        }.first.trimStart { it == '0' }.ifEmpty { "0" }
}


fun multipleOneDigit(num: String, multiplier: Int, pointer: Int): String {
    return ("0$num").toCharArray().map { it.digitToInt() }
        .foldRight(Pair(0, "")) { i, acc ->
            val r = i * multiplier + acc.first
            Pair(r / 10, "${r % 10}${acc.second}")
        }.second + ("0".repeat(pointer))
}