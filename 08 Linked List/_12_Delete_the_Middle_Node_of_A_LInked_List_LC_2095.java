package _08_Linked_List;


public class _12_Delete_the_Middle_Node_of_A_LInked_List_LC_2095 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp =null;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
