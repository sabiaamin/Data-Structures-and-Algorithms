package _08_Linked_List;

public class _07_Linked_List_Cycle_II_LC_142 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                ListNode p=head;
                while(p!=slow){
                    slow=slow.next;
                    p=p.next;
                }
                if(slow==p){
                    return p;
                }
            }
        }
        return null;
    }
}
