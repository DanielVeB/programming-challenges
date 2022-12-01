package leetcode.algorithms

fun spiralOrder(matrix: Array<IntArray>): List<Int> {

    val result = mutableListOf<Int>()

    var topBorder = 0
    var bottomBorder = matrix.size - 1

    var toBottom = false

    var leftBorder = 0
    var rightBorder = matrix[0].size - 1

    while (topBorder <= bottomBorder){
        if(leftBorder > rightBorder){
            return result
        }
        for (i in topBorder .. bottomBorder) {
            if (i == topBorder && !toBottom) {
                result.addAll(matrix[i].copyOfRange(leftBorder, rightBorder + 1).toList())
                topBorder++
                toBottom = true
            } else if (i == bottomBorder && toBottom) {
                result.addAll(matrix[i].copyOfRange(leftBorder, rightBorder + 1).toList().reversed())
                bottomBorder--
                rightBorder--
                toBottom = false
            } else {
                if (toBottom) {
                    result.add(matrix[i][rightBorder])
                } else {
                    result.add(matrix[i][leftBorder])
                }
            }
        }

        if(leftBorder > rightBorder){
            return result
        }

        for (i in bottomBorder downTo topBorder ) {
            if (i == topBorder && !toBottom) {
                result.addAll(matrix[i].copyOfRange(leftBorder, rightBorder + 1).toList())
                topBorder++
                toBottom = true
            } else if (i == bottomBorder && toBottom) {
                result.addAll(matrix[i].copyOfRange(leftBorder, rightBorder + 1).toList().reversed())
                bottomBorder--
                rightBorder--
                toBottom = false
            } else {
                if (toBottom) {
                    result.add(matrix[i][rightBorder])
                } else {
                    result.add(matrix[i][leftBorder])
                }
            }
        }
        leftBorder++
    }
    return result
}
