package _05_Arrays;

public class _15b_Sort_Colors_LC_75 {
    public void swap(int []arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] arr) {

        int n=arr.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr,l,m);
                m++;
                l++;
            }else if(arr[m]==1){
                m++;
            }else if(arr[m]==2){
                swap(arr,m,h);
                h--;
            }
        }

    }
}
