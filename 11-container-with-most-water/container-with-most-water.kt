class Solution {
    fun maxArea(height: IntArray): Int {
        var res = 0
        var leftPtr = 0
        var rightPtr = height.size - 1

        while (leftPtr <= rightPtr) {
            val leftHeight = height[leftPtr]
            val rightHeight = height[rightPtr]

            val containerWidth = rightPtr - leftPtr
            var containerHeight: Int
            if (leftHeight > rightHeight) {
                containerHeight = rightHeight
                rightPtr--
            } else {
                containerHeight = leftHeight
                leftPtr++
            }

            res = maxOf(res, containerHeight * containerWidth)
        }

        return res
    }
}