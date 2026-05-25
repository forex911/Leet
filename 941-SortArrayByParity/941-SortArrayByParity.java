// Last updated: 5/25/2026, 11:08:42 AM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int result[] =new int[nums.length];
        int i=0;
        int j=0;
        for(int n:nums){
            if(n%2==0){
                result[j]=n;
                j++;
            }
            else{
                
                result[nums.length-1-i]=n;
                i++;
            }
        }
        return result;
    }
}