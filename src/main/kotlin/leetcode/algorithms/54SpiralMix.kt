package leetcode.algorithms

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    return if (matrix.isEmpty()) {
        listOf()
    } else matrix[0].toList() + spiralOrder(matrix.copyOfRange(1, matrix.size).rotate())
}

private fun Array<IntArray>.rotate(): Array<IntArray> {
    if (this.isEmpty()) return arrayOf()
    val l = mutableListOf<IntArray>()
    for (i in this[0].size - 1 downTo 0) {
        val row = mutableListOf<Int>()
        for (j in 0 until this.size) {
            row.add(this[j][i])
        }
        l.add(row.toIntArray())
    }
    return l.toTypedArray()
}