package leetcode.binarysearch

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan&id=level-2

fun search(nums: IntArray, target: Int): Int {

    return nums.movePivots(0, nums.size / 2, nums.size - 1, target)
}

private fun IntArray.movePivots(low: Int, middle: Int, high: Int, target: Int): Int {

    if (this[low] == target) return low
    if (this[high] == target) return high
    if (this[middle] == target) return middle

    if (low >= high) return -1

    if (this[low] > target && this[middle] > target && this[middle] > this[low]) {
        return this.movePivots(middle, (high + middle + 1) / 2, high, target)
    }

    if (this[low] > target && this[middle] > target && this[middle] < this[low]) {
        return this.movePivots(low, (middle + low) / 2, middle, target)
    }

    if (this[low] < target && this[middle] < target && this[middle] > this[low]) {
        return this.movePivots(middle, (high + middle + 1) / 2, high, target)
    }

    if (this[low] < target && this[middle] < target && this[middle] < this[low]) {
        return this.movePivots(low, (middle + low) / 2, middle, target)
    }

    if (this[low] < target && this[middle] > target) {
        return this.movePivots(low, (middle + low) / 2, middle, target)
    }

    if (this[low] > target && this[middle] < target) {
        return this.movePivots(middle, (high + middle + 1) / 2, high, target)
    }
    return -1
}