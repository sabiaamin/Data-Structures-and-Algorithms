package _05_Arrays;

public class _15a_Sort_Colors_LC_75 {
    public void sortColors(int[] arr) {
        int i=0;
        int c0=0,c1=0,c2=0;
        int n=arr.length;
        for(;i<n;i++){
            if(arr[i]==0){
                c0++;
            }else if(arr[i]==1){
                c1++;
            }else if(arr[i]==2){
                c2++;
            }
        }
        for(i=0;i<n;i++){
            if(i<c0){
                arr[i]=0;
            }else if(i>=c0 && i<(c1+c0)){
                arr[i]=1;
            }else if(i >=c1 && i<(c2+c1+c0)){
                arr[i]=2;
            }
        }

    }
}
