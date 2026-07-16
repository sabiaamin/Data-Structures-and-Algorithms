package _07_Strings;

public class _10_Roman_To_Integer_LC_13 {
    public int romanToInt(String s) {
        char []ch =s.toCharArray();
        int i=0;
        int sum=0;
        while(i<s.length()-1){
            if( getVal(ch[i]) >= getVal(ch[i+1])){
                sum+=getVal(ch[i]);
            }else if( getVal(ch[i]) < getVal(ch[i+1])){
                sum-=getVal(ch[i]);
            }
            i++;
        }
        sum+=getVal(ch[i]);
        return sum;
    }
    public int getVal(char ch){
        switch(ch){
            case 'I' :return 1;
            case 'V' :return 5;
            case 'X' :return 10;
            case 'L' :return 50;
            case 'C' :return 100;
            case 'D' :return 500;
            case 'M' :return 1000;
        }
        return 0;
    }
}
