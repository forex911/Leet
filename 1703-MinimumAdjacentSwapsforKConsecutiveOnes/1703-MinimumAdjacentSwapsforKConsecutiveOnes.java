// Last updated: 10/12/2026, 5:06:06 PM
1class Solution {
2        public int minMoves(int[] nums, int k) {
3        ArrayList<Long> A = new ArrayList<Long>(), B = new ArrayList<Long>();
4        for (int i = 0; i < nums.length; ++i)
5            if (nums[i] == 1)
6                A.add((long)i);
7        long res = Long.MAX_VALUE;
8        B.add(0L);
9        for (int i = 0; i < A.size(); ++i)
10            B.add(B.get(i) + A.get(i));
11        for (int i = 0; i <  A.size() - k + 1; ++i)
12            res = Math.min(res, B.get(i + k) - B.get(k / 2 + i) - B.get((k + 1) / 2 + i) + B.get(i));
13        res -= (k / 2) * ((k + 1) / 2);
14        return (int)res;
15    }
16}