package _07_Strings;

import java.util.HashMap;

public class _05_Isomorphic_Strings_LC_205 {
    public boolean isIsomorphic(String s, String t) {    // space : O(1) and time :O(n) //conatant spaceO(1) and O(n)
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1[ch1]!=map2[ch2]){
                return false;
            }
            map1[ch1]=i+1;
            map2[ch2]=i+1;
        }
        return true;
    }
    public boolean isIsomorphic1(String s, String t) {    //space : O(n) and time :O(n)
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map1.containsKey(ch1)){
                if(map1.get(ch1)!=ch2){
                    return false;
                }
            }else{
                if(map2.containsKey(ch2)){
                    return false;
                }
                map1.put(ch1,ch2);
                map2.put(ch2,ch1);
            }
        }
        return true;
    }

}

