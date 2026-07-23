package _08_Linked_List;

import java.util.ArrayList;
import java.util.List;

public class _19_Pair_Sum_In_DOubly_Linked_List_GFG {
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
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        if(head==null){
            return ls;
        }
        Node start=head;
        Node end=head;
        while(end.next!=null){
            end=end.next;
        }
        while(start!=end && start.prev!=end){
            int sum=start.data+end.data;
            if(sum==target){
                ArrayList<Integer> newRow=new ArrayList<>(List.of(start.data,end.data));
                ls.add(newRow);
                end=end.prev;
                start=start.next;
            }else if(sum>target){
                end=end.prev;
            }else if(sum<target){
                start=start.next;
            }
        }
        return ls;
    }
}
