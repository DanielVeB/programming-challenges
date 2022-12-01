package leetcode.algorithms

//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.

fun isHappy(n: Int): Boolean {
    val results = mutableSetOf<Int>()
    var temp = n
    while (temp != 1 ){
        temp = getSumOfSquares(temp)
        if(results.contains(temp)) break
        results.add(temp)
    }
    return temp == 1
}

private fun getSumOfSquares(n: Int): Int =
    n.toString().map { it.toString().toInt() }.sumOf { it * it }