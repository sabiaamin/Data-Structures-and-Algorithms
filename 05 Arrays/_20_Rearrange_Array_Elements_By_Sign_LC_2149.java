package _05_Arrays;

public class _20_Rearrange_Array_Elements_By_Sign_LC_2149 {
    public int[] rearrangeArray(int[] arr) {
        int []result =new int[arr.length];
        int p=0;
        int n=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[p]=arr[i];
                p=p+2;
            }
            else if(arr[i]<0){
                result[n]=arr[i];
                n=n+2;
            }
        }

        return result;
    }
}
