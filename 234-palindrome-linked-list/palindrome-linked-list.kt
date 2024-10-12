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
    fun isPalindrome(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow!!.next
            fast = fast.next!!.next
        }

        val reversed = reverseList(slow)

        var originalPtr = head
        var reversedPtr = reversed

        while (reversedPtr != null) {
            if (originalPtr?.`val` != reversedPtr.`val`) return false
            originalPtr = originalPtr.next
            reversedPtr = reversedPtr.next
        }

        return true
    }

    fun reverseList(list: ListNode?): ListNode? {
        val head = list ?: return null

        var curr: ListNode? = head
        var next: ListNode?
        var prev: ListNode? = null

        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

        return prev
    }
}