class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen:MutableMap<Int, Int> = mutableMapOf()

        for (i in nums.indices) {
            val neededKey = target - nums[i]
            if (seen.containsKey(neededKey)) {
                return intArrayOf(seen.get(neededKey)!!, i)
            }

            seen.put(nums[i], i)
        }

        return intArrayOf(0, 0)
    }
}