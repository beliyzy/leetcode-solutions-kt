class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val seen = nums.toSet()
        var maxSequence = 0

        for (num in nums) {
            if (!seen.contains(num - 1)) {
                var count = 1
                var number = num
                while (seen.contains(number + 1)) {
                    count++
                    number++
                }

                maxSequence = maxOf(maxSequence, count)
            }
        }

        return maxSequence
    }
}