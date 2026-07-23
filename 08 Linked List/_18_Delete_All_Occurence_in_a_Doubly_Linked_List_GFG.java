package _08_Linked_List;

public class _18_Delete_All_Occurence_in_a_Doubly_Linked_List_GFG {
    class Node
    {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }
    static Node deleteAllOccurOfX(Node head, int x) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==x){
                Node delete =temp;
                temp=temp.next;
                if(delete==head){
                    head=head.next;
                    if(head!=null){
                        head.prev=null;
                    }
                }else{
                    delete.prev.next=delete.next;
                    if(delete.next!=null){
                        delete.next.prev=delete.prev;
                    }
                }
                delete.next=null;
                delete.prev=null;
            }else{
                temp=temp.next;
            }

        }
        return head;
    }
}
