// Last updated: 6/26/2026, 6:04:24 PM
1class Solution {
2    public int countMajoritySubarrays(int[] nums, int target) {
3        int balance = 0;
4        Map<Integer, Integer> cnt = new HashMap<>();
5        cnt.put(0, 1);
6        int res = 0;
7        int curr = 0;
8        for (int x : nums) {
9            if (x == target) {
10                curr += cnt.getOrDefault(balance, 0);
11                balance++;
12            } else {
13                balance--;
14                curr -= cnt.getOrDefault(balance, 0);
15            }
16            cnt.put(balance, cnt.getOrDefault(balance, 0) + 1);
17            res += curr;
18        }
19        return res;
20    }
21}