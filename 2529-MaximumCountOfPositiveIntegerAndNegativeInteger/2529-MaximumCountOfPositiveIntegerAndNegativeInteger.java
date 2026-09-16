// Last updated: 9/16/2026, 2:01:20 PM
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