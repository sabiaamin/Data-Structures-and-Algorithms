package _08_Linked_List;

public class _17_Add_Two_Numbers_LC_2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode h=result;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        while(temp1!=null || temp2!=null ||carry!=0){
            int num=carry;
            if(temp1!=null){
                num+=temp1.val;
            }
            if(temp2!=null){
                num+=temp2.val;
            }

            ListNode t=new ListNode(num%10);
            result.next=t;
            result=result.next;
            carry=num/10;
            if(temp1!=null){
                temp1=temp1.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }

        }
        return h.next;
    }
}
