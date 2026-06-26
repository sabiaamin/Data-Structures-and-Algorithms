package _05_Arrays;

public class _25_Rotate_Image_LC_48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp=0;
        int i,j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n/2;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}
