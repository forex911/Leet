// Last updated: 5/25/2026, 11:11:32 AM
class Solution {
    public int maxProduct(int[] nums) {
        int maxi=nums[0];
        int mini=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            if(cur<0){
                int tem=maxi;
                maxi=mini;
                mini=tem;
            }
            maxi=Math.max(cur,maxi*cur);
            mini=Math.min(cur,mini*cur);
            result=Math.max(result,maxi);
        }
        return result;
    }
}