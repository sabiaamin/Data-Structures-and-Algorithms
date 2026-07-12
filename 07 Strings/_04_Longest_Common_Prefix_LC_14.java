package _07_Strings;

public class _04_Longest_Common_Prefix_LC_14 {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs[0].length();i++){
            char ch= strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if( strs[j].length()==i || strs[j].charAt(i)!=ch ){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public String longestCommonPrefix1(String[] strs) {
        int count=strs[0].length();
        for(int i=1;i<strs.length;i++){
            count = Math.min(count, strs[i].length());
            int inter_count=0;
            for(int j=0;j<count;j++){
                if(strs[0].charAt(j)==strs[i].charAt(j)){
                    inter_count++;
                }else{
                    count = inter_count;
                    break;
                }
            }
        }
        return strs[0].substring(0,count);
    }
}
