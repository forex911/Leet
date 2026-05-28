// Last updated: 5/28/2026, 10:42:09 PM
1class NumArray {
2    private int[] prefix;
3
4    public NumArray(int[] nums) {
5        prefix = new int[nums.length + 1];
6        for (int i = 0; i < nums.length; i++) {
7            prefix[i + 1] = prefix[i] + nums[i];
8        }
9    }
10
11    public int sumRange(int left, int right) {
12        return prefix[right + 1] - prefix[left];
13    }
14}