// Last updated: 10/6/2026, 12:09:35 PM
1class Solution {
2    public int minSwaps(String s) {
3        Stack<Integer> store=new Stack<>();
4        int ans=0;
5        for(char c:s.toCharArray()){
6            if(c=='['){
7                store.push(1);
8            }
9            else{
10                if(store.isEmpty()){
11                    ans+=1;
12                }
13                else{
14                    store.pop();
15                }
16            }
17        }
18        return (ans+1)/2;
19    }
20}