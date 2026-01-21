class _06a_All_divisors_of_a_Number_GG {
    public static void print_divisors(int n) {
        int sq = (int) Math.sqrt(n);
        for(int i=1;i<=sq;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        for(int i = sq;i>=1;i--){
            if(n%i==0){
                if(n/i!=i)
                    System.out.print(n/i + " ");
            }
        }
    }
    public static void main(String[] args) {
         print_divisors(2);
    }
}

