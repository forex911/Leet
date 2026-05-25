// Last updated: 5/25/2026, 11:11:21 AM
class Solution {
    public int majorityElement(int[] nums) {
        int candi=0;
        int count=0;
        for (int i:nums){
            if(count==0){
                candi=i;
            }
            count+=candi==i ? 1:-1;
        }
        return candi;
    }
}