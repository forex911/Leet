// Last updated: 6/3/2026, 5:34:18 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] store=new int[128];
4        for(char x:s.toCharArray()){
5            store[x]++;
6        }
7        int res=0;
8        boolean odd=false;
9        for(int x:store){
10            if(x%2==0){
11                res+=x;
12            }
13            else{
14                res+=x-1;
15                odd=true;
16            }
17        }
18        if(odd) res++;
19        return res;
20    }
21}