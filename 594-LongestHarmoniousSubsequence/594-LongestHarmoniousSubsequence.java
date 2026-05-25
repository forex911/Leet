// Last updated: 5/25/2026, 11:09:30 AM
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max=0,j=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                max=Math.max(max,i-j+1);
            }
        }
        return max;
    }
}