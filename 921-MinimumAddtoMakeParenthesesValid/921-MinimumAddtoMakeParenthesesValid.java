// Last updated: 10/6/2026, 3:08:45 PM
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int ans=0;
4        int check=0;
5        for(char c:s.toCharArray()){
6            if(c=='('){
7                check+=1;
8            }
9            else{
10                if(check==0){
11                    ans+=1;
12                }
13                else{
14                    check-=1;
15                }
16            }
17        }
18        ans+=check;
19        return ans;
20    }
21}