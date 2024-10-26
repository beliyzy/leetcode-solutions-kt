class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set: MutableSet<Int> = mutableSetOf()

        for (n in nums) {
            set.add(n)
        }

        return set.size != nums.size
    }
}