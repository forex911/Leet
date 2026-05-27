// Last updated: 5/27/2026, 5:47:39 AM
1class Solution {
2
3    public int characterReplacement(String s, int k) {
4
5        int[] freq = new int[26];
6
7        int left = 0;
8
9        int maxFreq = 0;
10
11        int ans = 0;
12
13        for (int right = 0; right < s.length(); right++) {
14
15            char ch = s.charAt(right);
16
17            freq[ch - 'A']++;
18
19            maxFreq = Math.max(
20                maxFreq,
21                freq[ch - 'A']
22            );
23
24            while ((right - left + 1) - maxFreq > k) {
25
26                freq[s.charAt(left) - 'A']--;
27
28                left++;
29            }
30
31            ans = Math.max(
32                ans,
33                right - left + 1
34            );
35        }
36
37        return ans;
38    }
39}