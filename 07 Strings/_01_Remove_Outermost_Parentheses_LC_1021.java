package _07_Strings;

public class _01_Remove_Outermost_Parentheses_LC_1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    ans.append(ch);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}
