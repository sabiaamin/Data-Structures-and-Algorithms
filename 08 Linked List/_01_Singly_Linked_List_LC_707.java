package _08_Linked_List;

public class _01_Singly_Linked_List_LC_707 {
    class Node {
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int size;
    public _01_Singly_Linked_List_LC_707() {
        head=null;
        size=0;
    }

    public int get(int index) {
        if(index<0 || index>=size){
            return -1;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.data;
    }

    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode=new Node(val);
        Node cur=head;
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {

        if(index < 0 || index > size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        Node cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        Node newNode=new Node(val);
        newNode.next=cur.next;
        cur.next=newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node cur=head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        size--;
    }
}
