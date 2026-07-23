package _08_Linked_List;

public class _13_Sort_List_LC_148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=left;
                left=left.next;
            }else if(left.val>right.val){

                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next=right;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        ListNode left=head;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode merge1(ListNode left,ListNode right){
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                temp.next=new ListNode(left.val);
                temp=temp.next;
                left=left.next;
            }else if(left.val>right.val){
                temp.next=new ListNode(right.val);
                temp=temp.next;
                right=right.next;
            }
        }
        while(left!=null){
            temp.next=new ListNode(left.val);
            temp=temp.next;
            left=left.next;
        }
        while(right!=null){
            temp.next=new ListNode(right.val);
            temp=temp.next;
            right=right.next;
        }
        return dummy.next;
    }
    public ListNode sortList1(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode right=slow.next;
        slow.next=null;
        ListNode left=head;
        left=sortList1(left);
        right=sortList1(right);
        return merge1(left,right);
    }
}
