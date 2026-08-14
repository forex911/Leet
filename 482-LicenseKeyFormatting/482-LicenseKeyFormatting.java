// Last updated: 8/14/2026, 10:48:05 AM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '-') {
                continue;
            }

            if (count == k) {
                ans.append('-');
                count = 0;
            }

            ans.append(Character.toUpperCase(c));
            count++;
        }

        return ans.reverse().toString();
    }
}