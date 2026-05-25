// Last updated: 5/25/2026, 11:07:19 AM
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int n:nums){
            if(n>0){
               pos++;
            }
            if(n<0){
                neg++;
            }
        }
        if(pos>neg){
            return pos;
        }
        else if(pos==neg){
            return pos;
        }
        else{
            return neg;
        }
    }
}