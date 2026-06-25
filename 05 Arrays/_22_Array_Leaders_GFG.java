package _05_Arrays;

import java.util.ArrayList;

public class _22_Array_Leaders_GFG {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> r = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(max<=arr[i]){
                max=arr[i];
                r.add(0,arr[i]);
            }
        }
        return r;
    }
}
