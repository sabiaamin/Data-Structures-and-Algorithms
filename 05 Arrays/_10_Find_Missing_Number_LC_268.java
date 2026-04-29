package _05_Arrays;

public class _10_Find_Missing_Number_LC_268 {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]=1;
        }
        for(int i=0;i<n+1;i++){
            if(hash[i]!=1){
                return i;
            }
        }
        return -1;
    }
}
