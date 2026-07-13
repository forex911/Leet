// Last updated: 7/13/2026, 9:29:16 AM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3        List<Integer> ans = new ArrayList<>();
4        String s = "123456789";
5        int minLen = String.valueOf(low).length();
6        int maxLen = String.valueOf(high).length();
7        for (int len = minLen; len <= maxLen; len++) {
8            for (int j = 0; j + len <= 9; j++) {
9                int num = Integer.parseInt(s.substring(j, j + len));
10                if (num >= low && num <= high) {
11                    ans.add(num);
12                }
13            }
14        }
15        return ans;
16    }
17}   