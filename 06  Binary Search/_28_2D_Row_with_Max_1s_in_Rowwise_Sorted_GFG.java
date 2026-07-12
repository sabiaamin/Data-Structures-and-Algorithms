package _06_Binary_Search;

public class _28_2D_Row_with_Max_1s_in_Rowwise_Sorted_GFG {
    public int rowWithMax1s(int[][] arr) { //O(m+n)
        // code here
        int m=arr.length;
        int n=arr[0].length;
        int i=0;
        int j=n-1;
        int row=-1;
        while(i<m && j>=0){
            if(arr[i][j]==1){
                row=i;
                j--;
            }else{
                i++;
            }
        }
        return row;
    }
    public int rowWithMax1s1(int[][] arr) {//O(mlogn)
        // code here
        int idx=-1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int low=0;
            int high=arr[0].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[i][mid]==1){
                    if(arr[0].length-mid>count){
                        count=arr[0].length-mid;
                        idx=i;
                    }
                    high=mid-1;
                }if(arr[i][mid]==0){
                    low=mid+1;
                }
            }
        }
        return idx;
    }
}
