package _08_Linked_List;

public class _20_Remove_Duplicates_From_A_Sorted_DLL_GFG {
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
    Node removeDuplicates(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head.next;
        while(temp!=null){
            if(temp.data==temp.prev.data){
                Node delete=temp;
                temp=temp.next;
                delete.prev.next=delete.next;
                if(delete.next!=null){
                    delete.next.prev=delete.prev;
                }
                delete.prev=null;
                delete.next=null;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }
}
