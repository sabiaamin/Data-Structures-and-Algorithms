package _08_Linked_List;

public class _25_Copy_List_With_Random_Pointer_LC_138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node t=new Node(temp.val);
            Node next=temp.next;
            temp.next=t;
            t.next=next;
            temp=next;
        }
        temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.random==null){
                temp.next.random=null;
            }else{
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node dummy= new Node(0);
        Node tail=dummy;
        temp=head;
        while(temp!=null){
            Node delete=temp.next;
            tail.next=delete;
            tail=tail.next;
            temp.next=delete.next;
            temp=temp.next;

        }
        return dummy.next;
    }
}
