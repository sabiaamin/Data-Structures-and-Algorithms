package _07_Strings;

public class _13_Sum_of_Beauty_Of_All_Substrings_LC_1781 {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int []atoz=new int[26];

            atoz[s.charAt(i)-'a']++;
            atoz[s.charAt(i+1)-'a']++;

            for(int j=i+2; j<s.length();j++){
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                atoz[s.charAt(j)-'a']++;
                for(int k=0;k<26;k++){
                    if(atoz[k]>0){
                        if(max<atoz[k]){
                            max=atoz[k];
                        }
                        if(min>atoz[k]){
                            min=atoz[k];
                        }
                    }
                }
                sum += max-min;
            }
        }
        return sum;
    }
}
