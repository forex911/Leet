// Last updated: 7/30/2026, 1:50:06 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int min=0;
4        int max=0;
5        for(char c:s.toCharArray()){
6            if(c=='('){
7                min++;
8                max++;
9            }
10            else if(c==')'){
11                min--;
12                max--;
13            }
14            else if(c=='*'){
15                min--;
16                max++;
17            }
18            if(max<0) return false;
19            min=Math.max(min,0);
20        }
21        return min==0;
22    }
23}