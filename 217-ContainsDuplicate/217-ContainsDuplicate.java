// Last updated: 5/25/2026, 11:10:56 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
         HashSet<Integer> result=new HashSet<>();
         for(int num:nums){
            if(!result.add(num)){
                return true;
            }
            }
           return false;
         }
         
    }
