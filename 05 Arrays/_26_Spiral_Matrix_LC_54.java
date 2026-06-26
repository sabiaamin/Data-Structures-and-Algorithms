package _05_Arrays;

import java.util.ArrayList;
import java.util.List;

public class _26_Spiral_Matrix_LC_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i=0,j=0;
        int right=matrix[0].length-1;
        int left=0;
        int bottom=matrix.length-1;
        int top=0;
        List<Integer> ls= new ArrayList<>();
        while(top<=bottom && left<= right){
            for(j=left;j<=right;j++){
                ls.add(matrix[top][j]);
            }
            top++;
            for(i=top;i<=bottom;i++){
                ls.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(j=right;j>=left;j--){
                    ls.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ls;
    }
}
