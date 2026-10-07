// Last updated: 10/7/2026, 5:49:56 PM
1class Solution {
2    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
3        List<Integer> ans=new ArrayList<>();
4        int[] temp=new int[n];
5        for(List<Integer> node:edges){
6            temp[node.get(1)]++;
7        }
8        for(int i=0;i<n;i++){
9            if(temp[i]==0){
10                ans.add(i);
11            }
12        }
13        return ans;
14    }
15}