// Last updated: 6/30/2026, 10:18:05 AM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int count = 0;
4        int left = 0;
5        int[] charCount = new int[3];
6
7        for (int right = 0; right < s.length(); right++) {
8            charCount[s.charAt(right) - 'a']++;
9
10            while (charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0) {
11                count += s.length() - right;
12                charCount[s.charAt(left) - 'a']--;
13                left++;
14            }
15        }
16
17        return count;
18    }
19}