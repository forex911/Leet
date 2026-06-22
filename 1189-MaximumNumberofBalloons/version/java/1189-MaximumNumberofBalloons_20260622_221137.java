// Last updated: 6/22/2026, 10:11:37 PM
1class Solution {
2    public int maxNumberOfBalloons(String text) {
3        int b=0;
4        int a=0;
5        int l=0;
6        int o=0;
7        int n=0;
8        for (char c : text.toCharArray()) {
9            switch (c) {
10                case 'b': b++; break;
11                case 'a': a++; break;
12                case 'l': l++; break;
13                case 'o': o++; break;
14                case 'n': n++; break;
15            }
16        }
17        return Math.min(b,Math.min(a,Math.min(n,Math.min(l/2,o/2))));
18    }
19}