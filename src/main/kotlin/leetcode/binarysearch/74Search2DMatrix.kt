package leetcode.binarysearch

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

    return getRow(matrix, target).contains(target)

}

private fun getRow(matrix: Array<IntArray>, target: Int): IntArray {
    val size = matrix.size
    if (size == 1) return matrix[0]
    return if (matrix[size / 2][0] > target) {
        getRow(matrix.sliceArray(0 until size / 2), target)
    } else {
        getRow(matrix.sliceArray(size / 2 until size), target)
    }
}