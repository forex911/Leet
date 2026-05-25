// Last updated: 5/25/2026, 11:10:01 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int right=0;
        int left=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(cansplit(nums,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public Boolean cansplit(int[] nums,int k,int size){
        int sub=1;
        int curr=0;
        for(int num:nums){
            curr+=num;
            if(curr>size){
                sub++;
                curr=num;
                if(sub>k){
                    return false;
                }
            }
        }
        return true;
    }
}
