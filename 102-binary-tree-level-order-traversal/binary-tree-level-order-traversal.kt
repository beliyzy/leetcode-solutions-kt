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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val res = ArrayList<ArrayList<Int>>()
        val queue = LinkedList<TreeNode>()

        if (root == null) {
            return res
        }

        queue.offer(root)

        while (!queue.isEmpty()) {
            val size = queue.size
            var list = ArrayList<Int>()

            repeat(size) {
                val node = queue.poll()
                list.add(node.`val`)

                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }

            res.add(list)
        }

        return res
    }
}