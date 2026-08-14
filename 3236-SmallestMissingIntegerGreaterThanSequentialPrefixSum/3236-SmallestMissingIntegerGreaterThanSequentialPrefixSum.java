// Last updated: 8/14/2026, 10:42:02 AM
class Solution {
    public int missingInteger(int[] nums) {
        int check=0;
        check=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                check+=nums[i];
            }
            else{
                break;
            }
        }
        while(contains(check,nums)){
            check++;
        }
        return check;
    }
    public boolean contains(int n,int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]==n){
                return true;
            }
            i++;
        }
        return false;
    }
}