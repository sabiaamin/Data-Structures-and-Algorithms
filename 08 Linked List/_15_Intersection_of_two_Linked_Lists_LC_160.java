package _08_Linked_List;

public class _15_Intersection_of_two_Linked_Lists_LC_160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            p1=(p1==null)?headA:p1.next;
            p2=(p2==null)?headB:p2.next;
        }
        return p1;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode i=headA;
        while(i!=null){
            ListNode j=headB;
            while(j!=null){
                if(i==j){
                    return j;
                }
                j=j.next;
            }
            i=i.next;
        }
        return null;
    }
}
