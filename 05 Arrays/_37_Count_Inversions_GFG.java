package _05_Arrays;

import java.util.ArrayList;

public class _37_Count_Inversions_GFG {
    static int mergeSort(int[] arr,int low,int high){
        int mid=low+(high-low)/2;
        if(low>=high){
            return 0;
        }
        int count=0;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    static int merge(int [] nums,int low,int mid,int high){
        int left=low;
        int count=0;
        int right=mid+1;
        int k=0;
        int[] temp = new int[high - low + 1];
        while(left<=mid && right <= high){
            if(nums[left]<=nums[right]){
                temp[k]=nums[left];
                left++;
            }else{
                temp[k]=nums[right];
                count+=mid-left+1;
                right++;
            }
            k++;
        }
        while(left<=mid){
            temp[k]=nums[left];
            k++;
            left++;
        }
        while(right<=high){
            temp[k]=nums[right];
            k++;
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp[i-low];
        }
        return count;
    }
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
    }
}
