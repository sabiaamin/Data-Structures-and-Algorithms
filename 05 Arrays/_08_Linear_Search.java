package _05_Arrays;

public class _08_Linear_Search {
    public int search(int arr[], int x) {
        // code here
        int result=-1;
        int i=0;
        for(; i<arr.length;i++){
            if(arr[i]==x){
                result=i;
                break;
            }
        }
        return result;
    }
}
