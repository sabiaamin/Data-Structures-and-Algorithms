package _08_Linked_List;

public class _11_Remove_Nth_Node_From_End_of_List_LC_19 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size){
            return head.next;
        }
        temp=head;
        int count=1;
        while(temp!=null & count<size-n){
            count++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;



    }
}
