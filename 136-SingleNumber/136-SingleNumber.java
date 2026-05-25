// Last updated: 5/25/2026, 11:11:41 AM
class Solution {
    public int singleNumber(int[] nums) { 
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
}
