import java.util.ArrayList;
import java.util.List;

public class _06c_All_divisors_of_a_Number_using_ArrayList {
    public static List<Integer> divisors(int n){
        List<Integer> sdiv = new ArrayList<>();
        List<Integer> bdiv = new ArrayList<>();
        int sq = (int)Math.sqrt(n);
        for(int i=1;i<=sq;i++){
            if(n%i==0){
                sdiv.add(i);
                if(n/i!=i){
                    bdiv.add(0,n/i);
                }
            }
        }
        sdiv.addAll(bdiv);
        return sdiv;
    }
    public static void main(String[] args) {
        System.out.println( divisors(36));
    }
}
