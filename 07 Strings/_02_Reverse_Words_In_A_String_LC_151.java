package _07_Strings;

public class _02_Reverse_Words_In_A_String_LC_151 {
    public void reverse(char[] arr,int left,int right){
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }

    }
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        char[] ch= s.toCharArray();
        reverse(ch,0,ch.length-1);
        int start=0;
        int end=0;
        while(start<ch.length){
            while(start<ch.length && ch[start]==' '){
                start++;
            }
            end=start; // start and end on the first letter of the word
            while(end<ch.length && ch[end] !=' '){
                end++;
            }
            reverse(ch,start,end-1);
            start=end;
        }
        return new String(ch);
    }
    public void swap(String[] arr,int i,int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String reverseWords1(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        String []words=s.split("\\s");
        for(int i=0;i<words.length/2;i++){
            swap(words,i, words.length-1-i);
        }
        String result=String.join(" ",words);
        return result;
    }
}
