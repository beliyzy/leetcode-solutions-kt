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
    fun kthLargestLevelSum(root: TreeNode?, k: Int): Long {
        if (root == null) return -1L

        val pq = PriorityQueue<Long>()
        val q = LinkedList<TreeNode>()

        q.offer(root)

        while (!q.isEmpty()) {
            val size = q.size
            var sum = 0L

            repeat(size) {
                val node = q.poll()
                sum += node.`val`

                if (node.left != null) q.offer(node.left)
                if (node.right != null) q.offer(node.right)
            }

            pq.offer(sum)
            while (pq.size > k) pq.poll()
        }

        return if (pq.size < k) -1L else pq.poll()
    }
}