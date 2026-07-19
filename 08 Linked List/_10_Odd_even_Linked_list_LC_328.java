package _08_Linked_List;

public class _10_Odd_even_Linked_list_LC_328 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode odd=head;
        ListNode evenHead=head.next;
        ListNode even=evenHead;

        ListNode temp=head.next.next;
        int count =3;

        odd.next=null;
        even.next=null;

        while(temp!=null){
            ListNode next=temp.next;
            if(count%2==0){
                even.next=temp;
                even=even.next;
                even.next=null;
            }else if(count%2==1){
                odd.next=temp;
                odd=odd.next;
                odd.next=null;
            }
            count++;
            temp=next;
        }
        odd.next=evenHead;
        return head;


    }

}
