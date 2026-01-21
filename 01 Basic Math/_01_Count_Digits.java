class _01_Count_Digits {
    public int countDigit(int n) {
        int digits=0;
        while(n != 0){
            n /= 10;
            digits++;
        }
        return digits;
    }
}
