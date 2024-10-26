class Solution {
    fun missingNumber(nums: IntArray): Int {
        var sum = nums.sum()
        var total = nums.size * (nums.size + 1) / 2

        return total - sum
    }
}