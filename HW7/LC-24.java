//LC problem 24 - Swap Nodes in Pairs
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode w = new ListNode(0);
        w.next = head;
        ListNode cur = w;

        while (cur.next != null && cur.next.next != null) {
            ListNode u = cur.next, v = cur.next.next;
            u.next = v.next;
            cur.next = v;
            cur.next.next = u;

            cur = cur.next.next;

        }

        return w.next;
    }
}