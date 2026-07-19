package _08_Linked_List;

public class _05_Reverse_LInked_List_LC_206 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null){
            ListNode tempNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tempNode;
        }
        return prev;
    }
}
