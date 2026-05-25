// Last updated: 5/25/2026, 11:09:23 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum;

        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            if(max<sum){
                max=sum;
            }
        }
        return max/k;
    }
}