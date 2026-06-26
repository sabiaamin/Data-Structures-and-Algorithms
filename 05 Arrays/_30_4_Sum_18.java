package _05_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _30_4_Sum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0,j=0,l=0,r=n-1;
        long sum=0;
        List<List<Integer>> ls= new ArrayList<>();
        for(i=0;i<n-3;i++) {
            for(j=i+1;j<n-2;j++){
                l=j+1;
                r=n-1;
                if(i>0 && nums[i]==nums[i-1]){
                    continue;
                }else if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                else{
                    while(l<r){
                        sum=(long)nums[i]+nums[j]+nums[l]+nums[r]; // used bcz of overflow
                        if(sum<target){
                            l++;
                        }else if(sum>target){
                            r--;
                        }else if(sum==target){
                            List<Integer> row = new ArrayList<>();
                            row.add(nums[i]);
                            row.add(nums[j]);
                            row.add(nums[l]);
                            row.add(nums[r]);
                            l++;
                            r--;
                            while(l<r && nums[l]==nums[l-1]){
                                l++;
                            }
                            while(l<r && nums[r]==nums[r+1]){
                                r--;
                            }
                            ls.add(row);
                        }
                    }
                }

            }
        }
        return ls;
    }
}
