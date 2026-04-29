package _05_Arrays;

public class _07_Move_Zeros_LC_283 {
    public void swap(int arr[],int x,int y){
        int temp=0;
        temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public void moveZeroes(int[] arr) {
        int temp=0;
        int n=arr.length;
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(arr[i]==0){
                if(arr[j]!=0){
                    swap(arr,i,j);
                    i++;
                }//else {j++;} //arr[j]==0
            }else{ //arr[i]!=0
                i++;  //if(arr[j]==0 || arr[j]!=0)
            }
            j++;
        }
    }
}
