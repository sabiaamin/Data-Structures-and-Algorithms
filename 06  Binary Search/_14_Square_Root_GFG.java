package _06_Binary_Search;

public class _14_Square_Root_GFG {
    int floorSqrt(int n) {
        // code here
        int low=0;
        int high=n;
        int sq=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid<n){
                sq=mid;
                low=mid+1;

            }else if (mid*mid>n){
                high=mid-1;
            }
        }
        return sq;
    }
}
