package _08_Linked_List;

public class _23_Rotate_List_LC_61 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null){
            return head;
        }
        int size=1;
        ListNode tail=head;
        while(tail!=null && tail.next!=null){
            size++;
            tail=tail.next;
        }
        int count=1;
        ListNode temp=head;
        k=k%size;
        if(k==0){
            return head;
        }
        while(temp!=null && count<size-k){
            temp=temp.next;
            count++;
        }
        ListNode p=temp.next;
        temp.next=null;
        tail.next=head;
        return p;
    }
}
