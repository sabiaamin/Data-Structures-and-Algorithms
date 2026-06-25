package _05_Arrays;

import java.util.HashSet;
import java.util.Set;

public class _24_Set_Matrix_Zero_LC_73 {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        Set<Integer> rs = new HashSet<>();
        Set <Integer> cs = new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rs.add(i);
                    cs.add(j);
                }
            }
        }
        for(int i=0;i<r;i++){
            if(rs.contains(i)){
                for(int j=0;j<c;j++)
                    matrix[i][j]=0;
            }
        }
        for(int j=0;j<c;j++){
            if(cs.contains(j)){
                for(int i=0;i<r;i++)
                    matrix[i][j]=0;
            }
        }
    }
}
