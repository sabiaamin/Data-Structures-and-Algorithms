package _05_Arrays;

import java.util.HashSet;

public class _23_Longest_Consecutive_Sequence_LC_128 {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();
        int cur=Integer.MIN_VALUE;
        int count=0;
        int max_c=0;
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }
        for(int num : hash){
            count=0;
            if(!(hash.contains(num-1))){ // hash.contains(num+1) and if only 1 element
                cur=num;
                while(hash.contains(cur)){
                    count++;
                    cur++;
                }
                if(max_c<count){
                    max_c=count;
                }
            }
        }
        return max_c;
    }
}
