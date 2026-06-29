package _06_Binary_Search;

public class _12_Single_Element_in_a_Sorted_Array_LC_540 {
    public int singleNonDuplicate(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid = low + (high - low) / 2;
            if(mid%2==1){ //mid points to first occurence of each// first occurence occurs at even number
                mid--;
            }
            if(arr[mid]==arr[mid+1]){ //left side doesnt have it
                low=mid+2;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }
    public int singleNonDuplicate1(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int n=arr.length-1;
        int num=0;
        if(n==0){
            return arr[0];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>0 && mid<n && arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                num=arr[mid];
                break;
            }else if(mid==n && arr[mid]!=arr[mid-1]){
                num=arr[mid];
                break;
            }else if(mid==0 && arr[mid]!=arr[mid+1]){
                num=arr[mid];
                break;
            }
            if(mid>0 && mid<n){
                if(arr[mid]==arr[mid-1]){
                    if(mid%2==0){
                        high=mid-2;
                    }else if(mid%2==1){
                        low=mid+1;
                    }
                }
                else if(arr[mid]==arr[mid+1]){
                    if(mid%2==0){
                        low=mid+2;
                    }else if(mid%2==1){
                        high=mid-1;
                    }
                }
            }
        }
        return num;
    }
}
