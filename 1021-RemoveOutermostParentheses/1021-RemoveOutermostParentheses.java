// Last updated: 9/16/2026, 2:04:59 PM
class Solution {
    
    public String removeOuterParentheses(String s) {
        int open = 0, close = 0, start = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }

            if (open == close) {
                result.append(s, start + 1, i);
                start = i + 1;
            }
        }
        return result.toString();
    }
}
