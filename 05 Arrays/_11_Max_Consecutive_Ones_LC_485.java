package _05_Arrays;

public class _11_Max_Consecutive_Ones_LC_485 {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max1s=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(max1s<count){
                    max1s=count;
                }
            }
            else{   //(arr[i]!=1){
                count=0;
            }
        }
        return max1s;
    }
}
