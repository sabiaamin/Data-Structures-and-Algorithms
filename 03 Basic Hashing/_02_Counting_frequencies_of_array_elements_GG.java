package _03_Basic_Hashing;

import java.util.*;

public class _02_Counting_frequencies_of_array_elements_GG {
    public List<List<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            //ArrayList<Integer> r1 = new ArrayList<>();
            //r1.add(i.getKey());
            //r1.add(i.getValue());
            //result.add(r1);
            result.add(Arrays.asList(i.getKey(), i.getValue()));
        }
        return result;
    }
}

