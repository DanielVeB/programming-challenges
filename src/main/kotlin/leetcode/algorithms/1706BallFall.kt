package leetcode.algorithms

fun findBall(grid: Array<IntArray>): IntArray {

    val maxSize = grid[0].size
    val result = mutableListOf<Int>()

    for(j in  0 until maxSize){
        var pointer = j

        for (i in grid.indices){
            if(grid[i][pointer] == 1){
                if(pointer + 1 >= maxSize || grid[i][pointer+1] == -1 ){
                    pointer = -1
                    break
                }else{
                    pointer++
                }
            }
            if(grid[i][pointer] == -1){
                if(pointer -1 < 0 || grid[i][pointer-1] == 1 ){
                    pointer = -1
                    break
                }else{
                    pointer--
                }
            }
        }
        result.add(pointer)
    }

    return result.toIntArray()
}