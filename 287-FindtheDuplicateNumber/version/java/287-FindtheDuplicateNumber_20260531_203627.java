// Last updated: 5/31/2026, 8:36:27 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        HashSet<Integer> check=new HashSet<>();
4        for(int n:nums){
5            if(!check.contains(n)){
6                check.add(n);
7            }
8            else{
9                return n;
10            }
11        }
12        return 0;
13    }
14}