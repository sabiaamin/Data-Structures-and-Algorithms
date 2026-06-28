package _05_Arrays;

public class _36_Missing_And_Repeating_2D_array_LC_2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int i=0,j=0;
        long sum=0;
        long sum_sq=0;
        int n=grid.length;
        long t=n*n;
        long actual=(t)*(t+1)/2;
        long actual_sq=t*(t+1)*(2*t+1)/6;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                sum += grid[i][j];
                sum_sq += (long)grid[i][j]*grid[i][j];
            }
        }
        long diff=actual-sum;
        long add=(actual_sq -sum_sq)/(actual-sum);
        long m= (add+diff)/2;
        long r=(add-diff)/2;
        int [] ls= new int [2];
        ls[0]=(int)r;
        ls[1]=(int)m;
        return ls;
    }
}
