package _08_Linked_List;

public class _24_Flattening_A_Linked_List_gfg {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }
    public Node sortTwoList(Node l1,Node l2)
    {
        Node tail=new Node(0);
        Node head=tail;
        head.next=l2.next;

        while(l1!=null && l2!=null){
            if(l1.data<=l2.data){
                tail.bottom=l1;
                l1=l1.bottom;
            }else{
                tail.bottom=l2;
                l2=l2.bottom;
            }
            tail=tail.bottom;
        }
        tail.bottom = (l1==null)?l2:l1;
        Node next=head.next;
        head=head.bottom;
        head.next=next;

        return head;
    }
    public Node flatten(Node head) {
        // code here
        Node p = head;
        while(head!=null && head.next!=null){
            head=sortTwoList(head,head.next);
        }
        return head;

    }
}
