package _08_Linked_List;

public class _02_Delete_Node_in_a_Linked_List_LC_237 {
    class Node {
        int data;
        _01_Singly_Linked_List_LC_707.Node next;
        Node(int data, _01_Singly_Linked_List_LC_707.Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteNode(Node node) {
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
