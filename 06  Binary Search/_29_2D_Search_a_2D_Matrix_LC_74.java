package _06_Binary_Search;

public class _29_2D_Search_a_2D_Matrix_LC_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        boolean b=false;
        int high=n*m-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int i=mid/n;
            int j=mid%n;
            if(target==matrix[i][j]){
                return true;
            }else if(target>matrix[i][j]){
                low=mid+1;
            }else if(target<matrix[i][j]){
                high=mid-1;
            }
        }
        return b;
    }
}
