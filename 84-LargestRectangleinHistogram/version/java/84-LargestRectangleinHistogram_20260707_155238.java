// Last updated: 7/7/2026, 3:52:38 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> store=new HashSet<>();
4        for(int i:nums){
5            store.add(i);
6        }
7        return nums.length!=store.size()?true:false;
8    }
9}