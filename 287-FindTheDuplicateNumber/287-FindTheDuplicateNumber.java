// Last updated: 8/14/2026, 10:49:32 AM
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> check=new HashSet<>();
        for(int n:nums){
            if(!check.contains(n)){
                check.add(n);
            }
            else{
                return n;
            }
        }
        return 0;
    }
}