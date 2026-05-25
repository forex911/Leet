// Last updated: 5/25/2026, 11:10:34 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        int[] valid = new int[2];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
            if (temp == 1) {
                valid[index] = nums[i];
                index++;
            }
        }
        return valid;
    }
}
