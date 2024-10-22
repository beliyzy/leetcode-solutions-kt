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
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    fun isValidBST(root: TreeNode?, minVal: Long, maxVal: Long): Boolean {
        if (root == null) return true

        if (root.`val` <= minVal || root.`val` >= maxVal) return false
        return isValidBST(root.left, minVal, root.`val`.toLong()) && isValidBST(root.right, root.`val`.toLong(), maxVal)
    }
}