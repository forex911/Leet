// Last updated: 10/15/2026, 9:47:35 PM
1class Solution {
2    public int sumCounts(List<Integer> nums) {
3        int n = nums.size();
4        int res = 0;
5        for (int i = 0; i < n; i++) {
6            Set<Integer> s = new HashSet<>();
7            for (int j = i; j < n; j++) {
8                s.add(nums.get(j));
9                int d = s.size();
10                res += d * d;
11            }
12        }
13        return res;
14    }
15}