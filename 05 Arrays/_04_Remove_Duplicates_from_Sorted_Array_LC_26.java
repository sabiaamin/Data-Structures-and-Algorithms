package _05_Arrays;

public class _04_Remove_Duplicates_from_Sorted_Array_LC_26 {
    public int removeDuplicates(int arr[])
    {
        int j=0,i=0;
        int n=arr.length;
        while(j<n-1){
            if(arr[j]!=arr[j+1]){
                arr[i+1]=arr[j+1];
                i++;
            }
            j++;
        }
        return i+1;
    }
    public void main(String []args)
    {
        int []arr={1,1,1};
        int k=removeDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }

    }
}
