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
    fun averageOfLevels(root: TreeNode?): DoubleArray {
    if (root == null) {
        return doubleArrayOf()
    }

    val queue = LinkedList<TreeNode>()
    val res = mutableListOf<Double>()

    queue.offer(root)

    while (!queue.isEmpty()) {
        val size = queue.size
        var sum = 0.0

        repeat(size) {
            val node = queue.poll()

            sum += node.`val`

            if (node.left != null) {
                queue.offer(node.left)
            }
            if (node.right != null) {
                queue.offer(node.right)
            }
        }

        res.add(sum / size)
    }

    return res.toDoubleArray()
    }
}