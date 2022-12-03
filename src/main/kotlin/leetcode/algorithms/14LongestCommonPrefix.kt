package leetcode.algorithms

fun longestCommonPrefix(words: Array<String>): String {

    val prefix = (0..words[0].length).map {
        index -> words.map { it.startsWith(words[0].take(index + 1)) }.all { it }
    }.lastIndexOf(true)

    return words[0].take(prefix+1)
}