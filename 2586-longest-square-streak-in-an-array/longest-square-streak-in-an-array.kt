class Solution {
    fun longestSquareStreak(nums: IntArray): Int {
        val seen: MutableMap<Int, Int> = mutableMapOf()

        for (num in nums.sortedDescending()) {
            seen[num] = (seen[num * num] ?: 0) + 1
        }

        return seen.values.max().let { if (it == 1) -1 else it }
    }
}