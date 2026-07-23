package _08_Linked_List;

public class _24a_Flattening_A_Linked_List_gfg {
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
    public Node mergeTwoList(Node l1,Node l2)
    {
        Node tail=new Node(0);
        Node head=tail;

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

        return head.bottom;
    }
    public Node flatten(Node head) {
        if(head==null || head.next==null){
            return head;
        }

        head.next=flatten(head.next);
        return mergeTwoList(head,head.next);

    }
}
