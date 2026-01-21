package _02_Basic_Recursion;

public class _03_Reverse_an_Array_GG {
    public void reverseArray(int arr[]) {
        // code here
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;
            h--;
        }
    }
}
