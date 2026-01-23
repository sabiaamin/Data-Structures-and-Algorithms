//  You are given an array arr[] containing positive integers. The elements in the array arr[]
//  range from  1 to n (where n is the size of the array), and some numbers may be repeated or
//  absent. Your have to count the frequency of all numbers in the range 1 to n and
//  return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).
package _03_Basic_Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _01_Frequencies_in_a_Limited_Array_GG {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> mp =  new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            //int freq=0;
            //if(mp.containsKey(key)){
            //    freq=mp.get(key);}
            //freq++;
            //mp.put(key,freq);
            mp.put(key, mp.getOrDefault(key, 0) + 1);         // Get the value for 'key', or 0 if it's missing, then add 1.
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            //int key=i;
            //if(mp.containsKey(key)){
            //    result.add(i-1, mp.get(key));
            //}else{
            //    result.add(i-1,0);}
            result.add(mp.getOrDefault(i, 0));
        }
        return result;

    }
}
