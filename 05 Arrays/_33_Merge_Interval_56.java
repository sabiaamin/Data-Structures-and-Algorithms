package _05_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class _33_Merge_Interval_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> {
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int i=0,j=0;
        List<int[]> ls= new ArrayList<>();
        int[] row = new int[2];
        row[0]=intervals[0][0];
        row[1]=intervals[0][1];
        ls.add(row);
        int x=0;
        for(i=1;i<intervals.length;i++){
            j=0;
            x=ls.get(ls.size()-1)[j+1];
            if(x >= intervals[i][j]){
                if(x < intervals[i][j+1]){
                    ls.get(ls.size()-1)[j+1]=intervals[i][j+1];
                }
            }else{
                int[] row1= new int[2];
                row1[0]=intervals[i][j];
                row1[1]=intervals[i][j+1];
                ls.add(row1);
            }
        }
        return ls.toArray(new int[0][]);
    }
}
