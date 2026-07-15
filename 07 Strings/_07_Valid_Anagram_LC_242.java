package _07_Strings;

public class _07_Valid_Anagram_LC_242 {
    public boolean isAnagram(String s, String t) {
        int[] atoz=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch : s.toCharArray()){
            atoz[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            atoz[ch-'a']--;
        }
        for(int count :atoz){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
