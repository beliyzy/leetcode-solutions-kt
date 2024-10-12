class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        var productFromStart = 1
        for (i in nums.indices) {
            arr[i] = productFromStart
            productFromStart *= nums[i]
        }

        var productFromEnd = 1
        for (i in nums.indices.reversed()) {
            arr[i] *= productFromEnd
            productFromEnd *= nums[i]
        }

        return arr
    }
}