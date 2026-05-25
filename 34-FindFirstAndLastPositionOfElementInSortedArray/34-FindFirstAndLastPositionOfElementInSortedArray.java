// Last updated: 5/25/2026, 11:13:08 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        for( int i=0;i<nums.length;i++){
              if(nums[i]==target){
                  if (arr[0]!=-1){
                    arr[1]=i;
                  }
                  else{
                    arr[0]=i;
                    arr[1]=i;
                  }
              }
        }
         return arr;
    }
}