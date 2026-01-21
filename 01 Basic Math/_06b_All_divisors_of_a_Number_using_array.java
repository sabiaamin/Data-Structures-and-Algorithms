public class _06b_All_divisors_of_a_Number_using_array {
    public static int[] divisors(int n) {
            int sq = (int)Math.sqrt(n);
            int[] div= new int[2*sq];
            int count=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    div[count++] = i;

                }
            }
            for(int i = (int)Math.sqrt(n);i>=1;i--){
                if(n%i==0){
                    if(n/i!=i)
                        div[count++] = n/i;
                }
            }
            return div;
        }
    public static void main(String[] args) {
        int n = 2;
        int[] result = divisors(n);

        for (int i = 1; i <= result.length ; i++) {
                System.out.print(i + " ");
        }
    }
}
