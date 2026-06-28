package _05_Arrays;

import java.util.ArrayList;

public class _35_Missing_And_Repeating_GFG {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int i=0;
        long sum=0;
        long sum_sq=0;
        int n=arr.length;
        long actual=(long)n*(n+1)/2;
        long actual_sq=(long)n*(n+1)*(2*n+1)/6;
        for(i=0;i<arr.length;i++){
            sum += arr[i];
            sum_sq += (long)arr[i]*arr[i];
        }
        long diff=actual-sum;
        long add=(actual_sq -sum_sq)/(actual-sum);
        long m= (add+diff)/2;
        long r=(add-diff)/2;
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add((int)r);
        ls.add((int)m);
        return ls;

    }
}
