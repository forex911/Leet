// Last updated: 5/25/2026, 11:09:16 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for (int i=0;i<nums.length;i++){
             total+=nums[i];
        }
        int leftsums=0;
        for (int i=0;i<nums.length;i++){
            if(leftsums==total-leftsums-nums[i]){
                return i;
            }
            leftsums+=nums[i];
        }
        return -1;
    }
}