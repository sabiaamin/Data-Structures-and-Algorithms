package _07_Strings;

import java.util.PriorityQueue;

public class _08_Sort_Charcaters_By_Frequency_LC_451 {
    class Solution {
        public String frequencySort(String s) {
            PriorityQueue<int[]> pq= new PriorityQueue<>( (a, b) -> b[1]-a[1]);
            int[] freq = new int[128];
            StringBuilder sb = new StringBuilder();

            for(char ch : s.toCharArray()){
                freq[ch]++;
            }
            for(int i=0;i<freq.length;i++){
                if(freq[i]!=0){
                    pq.offer(new int[]{ (char)(i),freq[i]});
                }
            }

            while(!pq.isEmpty()){
                int [] current=pq.poll();
                char character=(char)current[0];
                int f=current[1];
                for(int i=0;i<f;i++){
                    sb.append(character);
                }
            }
            return sb.toString();
        }
    }
}
