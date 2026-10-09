// Last updated: 10/9/2026, 9:51:12 AM
1class Solution {
2    public int minInsertions(String s) {
3        int openCount = 0;
4        int openNeeded = 0;
5        int n = s.length();
6        int i = 0;
7
8        while (i < n) {
9            if (s.charAt(i) == '(') {
10                openCount++;
11                i++;
12            } else {
13                if (i + 1 < n && s.charAt(i + 1) == ')') {
14                    i += 2;
15                } else {
16                    openNeeded++;
17                    i++;
18                }
19
20                if (openCount > 0) {
21                    openCount--;
22                } else {
23                    openNeeded++;
24                }
25            }
26        }
27
28        return openNeeded + openCount * 2;
29    }
30}