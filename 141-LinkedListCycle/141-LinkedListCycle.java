// Last updated: 7/8/2026, 3:36:36 PM
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null && f.next!=null){
            s=s.next; f=f.next.next;
            if(s==f) return true;
        }
        return false;
    }
}