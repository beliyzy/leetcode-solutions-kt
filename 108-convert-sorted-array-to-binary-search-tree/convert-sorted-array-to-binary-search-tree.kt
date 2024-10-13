/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
  fun sortedArrayToBST(nums: IntArray): TreeNode? {
        return generateTree(nums, 0, nums.size - 1)
    }

    fun generateTree(nums: IntArray, left: Int, right: Int): TreeNode? {
        if (left > right) return null

        var mid = left + (right - left) / 2

        val node = TreeNode(nums[mid])

        node.left = generateTree(nums, left, mid - 1)
        node.right = generateTree(nums, mid + 1, right)

        return node
    }
}