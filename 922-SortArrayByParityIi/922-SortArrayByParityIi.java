// Last updated: 9/16/2026, 2:05:34 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res=new int[nums.length];
        int e=0;
        int o=1;
        for(int n:nums){
            if(n%2==0) {
                res[e]=n;
                e+=2;}
            else {
                res[o]=n;
                o+=2;
             
            }
        }
        return res;
    }
}