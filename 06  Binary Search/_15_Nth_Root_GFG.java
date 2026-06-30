package _06_Binary_Search;

public class _15_Nth_Root_GFG {
    public int nthRoot(int n, int m) {
        // code here
        int low=0;
        int high=m;
        int root=-1;
        while(low<=high){
            int mid=low+(high-low)/n;
            if(Math.pow(mid,n)==m){
                return mid;
            }else if(Math.pow(mid,n)<m){
                low=mid+1;
            }else if(Math.pow(mid,n)>m){
                high=mid-1;
            }
        }
        return root;
    }
}
