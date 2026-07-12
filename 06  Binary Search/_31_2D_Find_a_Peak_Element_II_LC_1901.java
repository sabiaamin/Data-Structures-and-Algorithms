package _06_Binary_Search;

public class _31_2D_Find_a_Peak_Element_II_LC_1901 {
    public int[] findPeakGrid(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int low=0;
        int high=c-1;
        int idx_i=0;
        int idx_j=0;
        int []result=new int[2];
        while(low<=high){
            int max=Integer.MIN_VALUE;
            int mid=low+(high-low)/2;
            for(int i=0;i<r;i++){
                if(mat[i][mid]>max){
                    max=mat[i][mid];
                    idx_i=i;
                    idx_j=mid;
                }
            }
            int left = (idx_j == 0) ? -1 : mat[idx_i][idx_j - 1];
            int right = (idx_j == c - 1) ? -1 : mat[idx_i][idx_j + 1];

            if(left < max && right < max ){
                result[0]=idx_i;
                result[1]=idx_j;
                break;
            }else{
                if(left>max){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return result;
    }
}
