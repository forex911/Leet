// Last updated: 5/27/2026, 5:55:21 AM
1class Solution {
2
3    public int longestOnes(int[] nums, int k) {
4
5        int left = 0;
6
7        int zeros = 0;
8
9        int ans = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12
13            if (nums[right] == 0) {
14                zeros++;
15            }
16
17            while (zeros > k) {
18
19                if (nums[left] == 0) {
20                    zeros--;
21                }
22
23                left++;
24            }
25
26            ans = Math.max(
27                ans,
28                right - left + 1
29            );
30        }
31
32        return ans;
33    }
34}