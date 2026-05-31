// Last updated: 5/31/2026, 8:34:01 PM
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        HashSet<Integer> contain=new HashSet<>();
4        List<Integer> result=new ArrayList<>();
5        for(int n:nums){
6            if(!contain.contains(n)){
7                contain.add(n);
8            }
9            else{
10                result.add(n);
11            }
12        }
13        return result;
14    }
15}