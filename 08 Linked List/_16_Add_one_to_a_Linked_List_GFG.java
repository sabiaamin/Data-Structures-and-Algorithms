package _08_Linked_List;

public class _16_Add_one_to_a_Linked_List_GFG {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    public Node reverse(Node head){
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
    public Node addOne(Node head) {

        int carry=1;
        Node prev=null;
        head=reverse(head);
        Node temp=head;
        while(temp!=null){
            int num=temp.data+carry;
            temp.data=num%10;
            carry=num/10;

            prev=temp;
            temp=temp.next;
        }
        if(carry==1){
            prev.next=new Node(1);
        }
        head=reverse(head);
        return head;
    }
}
