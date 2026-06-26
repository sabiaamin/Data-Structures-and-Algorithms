package _05_Arrays;

import java.util.ArrayList;
import java.util.List;

public class _27_Pascals_Triangle_LC_117 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls= new ArrayList<>();
        int i=0,j=0;
        int x=0,y=0;
        for(i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    x=ls.get(i-1).get(j-1);
                    y=ls.get(i-1).get(j);
                    row.add(x+y);
                }
            }
            ls.add(row);
        }

        return ls;
    }
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> ls= new ArrayList<>();
        int i=0,j=0;
        int x=0,y=0;
        for(i=0;i<numRows;i++){
            for(j=0;j<=i;j++){
                ls.add(new ArrayList<>());
                if(j==0 && j==i){
                    ls.get(i).add(j,1);
                }else{
                    ls.get(i).add(j,0);
                }
            }
        }
        for(i=2;i<numRows;i++){
            for(j=1;j<i;j++){
                x=ls.get(i-1).get(j-1);
                y=ls.get(i-1).get(j+1);
                ls.get(i).add(j,x+y);
            }
        }
        return ls;
    }
}
