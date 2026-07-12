package _06_Binary_Search;

public class _30_2D_Search_in_2D_Matrix_II_LC_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int i=0,j=n-1;
        while(j>=0  && i<m){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
    public boolean searchMatrix1(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        boolean b=false;
        for(int i=0;i<m;i++){
            int low=0;
            int high=n-1;
            if(matrix[i][0]<target){
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }else if(matrix[i][mid]>target){
                        high=mid-1;
                    }else if(matrix[i][mid]<target){
                        low=mid+1;
                    }
                }
            }else if(matrix[i][0]==target){
                return true;
            }
        }
        return b;

    }
}
