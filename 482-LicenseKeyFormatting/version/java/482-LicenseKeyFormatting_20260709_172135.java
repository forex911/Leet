// Last updated: 7/9/2026, 5:21:35 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        StringBuilder ans = new StringBuilder();
4        int count = 0;
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            char c = s.charAt(i);
8
9            if (c == '-') {
10                continue;
11            }
12
13            if (count == k) {
14                ans.append('-');
15                count = 0;
16            }
17
18            ans.append(Character.toUpperCase(c));
19            count++;
20        }
21
22        return ans.reverse().toString();
23    }
24}