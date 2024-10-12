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
    fun rightSideView(root: TreeNode?): List<Int> {
        val res = ArrayList<Int>()
        helper(res, root, 0)
        
        return res
    }

    fun helper(list: ArrayList<Int>, root: TreeNode?, depth: Int) {
        if (root == null) return
        if(list.size == depth) list.add(root.`val`)
        helper(list, root.right, depth + 1)
        helper(list, root.left, depth + 1)
    }
}