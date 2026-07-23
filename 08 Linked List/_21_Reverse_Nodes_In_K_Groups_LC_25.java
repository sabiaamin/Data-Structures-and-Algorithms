package _08_Linked_List;

public class _21_Reverse_Nodes_In_K_Groups_LC_25 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverse(ListNode prev,ListNode head,int k ){

        ListNode cur=head;
        int count=0;
        while(cur!=null && count<k) {
            ListNode tempNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=tempNode;
            count++;
        }
        head.next=cur;
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int count=size;
        while(temp!=null){
            if(count>=k){
                ListNode newHead=reverse(null,temp,k);
                if(count==size){
                    head=newHead;
                }else{
                    prev.next=newHead;
                }
                count-=k;
                prev=temp;
                temp=temp.next;
            }else{
                break;
            }

        }
        return head;
    }
}
