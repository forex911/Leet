// Last updated: 5/25/2026, 11:08:05 AM
class Solution {
    public int longestSubarray(int[] nums) {

        var len = nums.length;
        var i = 0;
        var prevOnes = 0;
        var res = 0;

        while (i < len) {

            var currentOnes = 0;
            while (i < len && nums[i] == 1) {
                i++;
                currentOnes++;
            }

            var zeros = 0;
            while (i < len && nums[i] == 0) {
                i++;
                zeros++;
            }

            res = Math.max(res, prevOnes + currentOnes);
            prevOnes = zeros > 1 ? 0 : currentOnes;
        }

        return res==len ? res-1 : res;
    }
}