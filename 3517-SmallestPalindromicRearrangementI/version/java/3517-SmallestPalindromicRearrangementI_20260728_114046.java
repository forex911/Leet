// Last updated: 7/28/2026, 11:40:46 AM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max1, max2;
4        if (nums[0] > nums[1]) {
5            max1 = nums[0];
6            max2 = nums[1];
7        } else {
8            max1 = nums[1];
9            max2 = nums[0];
10        }
11        for (int i = 2; i < nums.length; i++) {
12            if (nums[i] > max1) {
13                max2 = max1;
14                max1 = nums[i];
15            } else if (nums[i] > max2) {
16                max2 = nums[i];
17            }else if (nums[i] > max2) {
18                max2 = nums[i];
19            
20            }
21        }
22        return (max1 - 1) * (max2 - 1);
23    }
24}