// Last updated: 7/8/2026, 3:36:30 PM
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode deserialize(String data) {
        if (data == null || data.length() == 0 || data.equals("[]")) {
            return null;
        }

        String[] values = data.replaceAll("[\\[\\] ]", "").split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            current.next = new ListNode(Integer.parseInt(value));
            current = current.next;
        }

        return dummy.next; 
    }
}

public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode sortedHead = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            ListNode prev = sortedHead;
            ListNode nextNode = sortedHead.next;
            while (nextNode != null) {
                if (current.val <= nextNode.val) {
                    break;
                }
                prev = nextNode;
                nextNode = nextNode.next;
            }
            ListNode temp = current.next;
            current.next = nextNode;
            prev.next = current;
            current = temp;
        }

        return sortedHead.next;
    }

    public static void main(String[] args) {
        String input = "[4,2,1,3]";
        ListNode head = ListNode.deserialize(input);
        Solution solution = new Solution();
        ListNode sortedHead = solution.insertionSortList(head);
        printList(sortedHead);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}