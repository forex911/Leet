// Last updated: 5/25/2026, 11:08:38 AM
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