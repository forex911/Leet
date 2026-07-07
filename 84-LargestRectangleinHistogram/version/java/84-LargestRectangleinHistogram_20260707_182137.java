// Last updated: 7/7/2026, 6:21:37 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> store=new HashSet<>();
4        for(int i:nums1){
5            store.add(i);
6        }
7        HashSet<Integer> ans=new HashSet<>();
8        for(int i:nums2){
9            if(store.contains(i)){
10                ans.add(i);
11            }
12        }
13       return ans.stream().mapToInt(Integer::intValue).toArray();
14
15    }
16}