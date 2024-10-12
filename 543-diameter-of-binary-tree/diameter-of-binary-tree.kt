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
    private var diameter = -1

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        dfs(root)
        return diameter
    }

    fun dfs(root: TreeNode?): Int {
        if (root == null) return -1

        val left = 1 + dfs(root.left)
        val right = 1 + dfs(root.right)

        diameter = maxOf(diameter, left + right)
        return maxOf(left, right)
    }
}