// Last updated: 8/14/2026, 10:48:18 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> contain=new HashSet<>();
        List<Integer> result=new ArrayList<>();
        for(int n:nums){
            if(!contain.contains(n)){
                contain.add(n);
            }
            else{
                result.add(n);
            }
        }
        return result;
    }
}