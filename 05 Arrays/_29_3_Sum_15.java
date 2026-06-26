package _05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _29_3_Sum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n=nums.length;
        int l=0,r=n-1,k=0;
        Arrays.sort(nums);

        for(k=0;k<n-2;k++){
            l=k+1;r=n-1;
            if(k>0 && nums[k] ==nums[k-1] ){
                continue;
            }
            else{
                while(l<r){
                    int sum=nums[k]+nums[l]+nums[r];
                    if(sum>0){
                        r--;
                    }else if(sum<0){
                        l++;
                    }else if(sum==0){
                        List<Integer> row = new ArrayList<>();
                        row.add(nums[k]);
                        row.add(nums[l]);
                        row.add(nums[r]);
                        ls.add(row);
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r+1]){
                            r--;
                        }
                    }
                }
            }

        }
        return ls;
    }
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int n=nums.length;
        int i=0,j=0,k=0;
        Arrays.sort(nums);
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> row = new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        ls.add(row);
                    }
                }
            }
        }
        return ls;
    }
}

