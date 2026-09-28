// Last updated: 9/28/2026, 2:49:54 PM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> list=new ArrayList<>();
4        backtrack(list,new ArrayList<>(),n,k,1);
5        return list;
6    }
7    public void backtrack(List<List<Integer>> list,ArrayList<Integer> tem,int n ,int k,int cur){
8         if (tem.size() == k) {
9            list.add(new ArrayList<>(tem));
10            return;
11        }
12        for(int i=cur;i<=n;i++){
13            if(!tem.contains(i)){
14                tem.add(i);
15                backtrack(list,tem,n,k,i+1);
16                tem.remove(tem.size()-1);
17            }
18        }
19    }
20}