package _08_Linked_List;

public class _14_Sort_a_linked_List_of_0s_1s_2s_GFG {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        public Node segregate(Node head) {
            // code here
            if (head == null || head.next == null)
                return head;
            Node temp = head;
            Node zerodummy = new Node(-1);
            Node onedummy = new Node(-1);
            Node twodummy = new Node(-1);
            Node zero = zerodummy;
            Node one = onedummy;
            Node two = twodummy;

            while (temp != null) {
                Node next = temp.next;
                if (temp.data == 0) {
                    zerodummy.next = temp;
                    zerodummy = zerodummy.next;
                    zerodummy.next = null;
                } else if (temp.data == 1) {
                    onedummy.next = temp;
                    onedummy = onedummy.next;
                    onedummy.next = null;
                } else if (temp.data == 2) {
                    twodummy.next = temp;
                    twodummy = twodummy.next;
                    twodummy.next = null;
                }
                temp = next;
            }
            zerodummy.next = (one.next != null) ? one.next : two.next;
            onedummy.next = two.next;
            if (zero.next != null)
                return zero.next;
            else if (one.next != null)
                return one.next;
            else
            return two.next;
        }
    }