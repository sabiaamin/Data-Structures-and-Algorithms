package _08_Linked_List;

public class _03_Doubly_Linked_List {
    class Node{
        int data;
        Node next;
        Node prev;


        Node(int data,Node prev,Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }

    }
    public Node ARtoDL(int []arr){
        Node head=new Node(arr[0]);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        return head;
    }
    public Node addHead(Node head,int val){
        Node newNode =new Node(val);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;

    }
    public Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
    public Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public Node reverse(Node head){
        Node temp=head;
        while(temp!=null) {
            Node prevNode=temp.prev;
            temp.prev=temp.next;
            temp.next=prevNode;
            head=temp;
            temp=temp.prev;
        }
        return head;
    }
    public void main(String [] args){
        int[] arr={1,2,5,7,3};
        Node n=new Node(arr[0]);
        //System.out.println(n.data);
        Node head = ARtoDL(arr);
        Node temp=head;
        System.out.println("doubly linked list : ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        head=deleteTail(head);
        System.out.println("doubly linked list tai; delete : ");
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        head=addHead(head,98);
        temp=head;
        System.out.println("doubly linked list : ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        head=reverse(head);
        temp=head;
        System.out.println("reversed doubly linked list : ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
