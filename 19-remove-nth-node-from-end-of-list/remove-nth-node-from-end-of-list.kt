/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null) {
            return null
        }
        val dummy = ListNode(-1)
        dummy?.next = head

        var slow: ListNode? = dummy
        var fast: ListNode? = dummy

        for (i in 1..n) {
            if (fast != null) {
                fast = fast.next
            }
        }

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast.next
        }

        slow?.next = slow?.next?.next

        return dummy.next
    }
}