package _08_Linked_List;

public class _26_Remove_Duplicates_From_Linked_List_sll_LC_83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                ListNode delete=temp.next;
                temp.next=delete.next;
                delete.next=null;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
    public ListNode deleteDuplicates1(ListNode head) {
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null){

            if(prev!=null && prev.val==temp.val){
                ListNode delete=temp;
                temp=temp.next;
                prev.next=delete.next;
                delete.next=null;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}
