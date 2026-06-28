package _06_Binary_Search;

public class _07_Number_Of_Occurence_GFG {
    int countFreq(int[] arr, int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        int count=0;
        int [] r=new int[2];
        r[0]=-1;
        r[1]=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                r[0]=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                r[1]=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }
        }
        if(r[0]==-1 && r[1]==-1){
            return 0;
        }
        return r[1]-r[0]+1;
    }
}
