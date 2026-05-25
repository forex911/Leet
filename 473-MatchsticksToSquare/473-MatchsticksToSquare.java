// Last updated: 5/25/2026, 11:09:48 AM
class Solution {
    public boolean makesquare(int[] nums) {
        int k=4;
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%k!=0) return false;
        int target=sum/k;
        Arrays.sort(nums);
        return solve(nums,target,nums.length-1,new int[k]);
    }
    public boolean solve(int[] nums,int target,int index,int[] bucket){
        if(index<0) return true;
        for(int i=0;i<bucket.length;i++){
            if(bucket[i]+nums[index]>target) continue;
            bucket[i]+=nums[index];
            if(solve(nums,target,index-1,bucket)) return true;
            bucket[i]-=nums[index];
            if(bucket[i]==0) break;
        }
        return false;
    }

}