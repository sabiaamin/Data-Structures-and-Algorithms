package _08_Linked_List;

public class _08_Length_of_a_Loop_GFG {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        int count=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                count=1;
                Node p=slow.next;
                while(p!=slow){
                    count++;
                    p=p.next;
                }
                return count;
            }
        }
        return count;
    }
}
