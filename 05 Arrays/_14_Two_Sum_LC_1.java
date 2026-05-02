package _05_Arrays;


import java.util.HashMap;

public class _14_Two_Sum_LC_1 {
    public int[] twoSum(int[] arr, int target) {
        int index_2=-1;
        int []index=new int[2];
        int i=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(;i<arr.length;i++)
        {
            index_2=map.getOrDefault((target-arr[i]),-1);
            if(index_2 != -1){
                index[0]=index_2;
                index[1]=i;
                return index;
            }
            map.put(arr[i],i);
        }
        return null;
    }
}
