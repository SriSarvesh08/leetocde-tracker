// Last updated: 7/8/2026, 3:39:39 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode ptr = head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy;
        int count = 0;
        while (ptr != null) {
            if (++count % k == 0) {
                start = reverseExclusive(start, ptr.next);
                ptr = start.next;
            } else {
                ptr = ptr.next;
            }
        }
        return dummy.next;
    }
    
    // reverse nodes between the start and end exclusively
    private ListNode reverseExclusive(ListNode start, ListNode end) {
        ListNode prev = start;
        ListNode revTail = start.next;
        ListNode current = start.next;
        while (current != end) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start.next = prev;
        revTail.next = current;
        return revTail;
    }
}