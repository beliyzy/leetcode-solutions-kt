class Solution {
    fun findMin(nums: IntArray): Int {
        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val m = (l + r) / 2

            if (nums[l] <= nums[r]) {
                return nums[l]
            }

            if (nums[m] >= nums[l]) {
                l = m + 1
            } else {
                r = m
            }
        }
        return 0
    }
}