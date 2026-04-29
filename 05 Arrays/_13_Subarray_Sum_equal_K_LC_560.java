package _05_Arrays;

public class _13_Subarray_Sum_equal_K_LC_560 {

    public int subarraySum(int[] arr, int k) {
        int sum=0;
        int i=0,j=0;
        int subarray=0;
        for(i=0;i<arr.length;i++){
            sum=0;
            for(j=i;j>=0;j--){
                sum+=arr[j];
                if(sum==k){
                    subarray++;
                }
            }
        }
        return subarray;
    }
}
