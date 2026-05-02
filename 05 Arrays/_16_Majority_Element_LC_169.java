package _05_Arrays;

import java.util.HashMap;
import java.util.Map;

public class _16_Majority_Element_LC_169 {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=arr.length;
        int i=0;
        int c=0;
        for(;i<n;i++){
            c=map.getOrDefault(arr[i],0)+1;
            map.put(arr[i],c);
        }
        int max=0;
        int max_value=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            c=e.getValue();
            if(c>max){
                max=c;
                max_value=e.getKey();
            }
        }
        return max_value;
    }
}
