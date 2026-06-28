package _05_Arrays;

import java.util.Arrays;

public class _34_Merge_Sorted_Arrays_LC_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0 ){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;j--;
        }
    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        for(i=m,j=0;(i<m+n) && j<n;i++,j++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}
