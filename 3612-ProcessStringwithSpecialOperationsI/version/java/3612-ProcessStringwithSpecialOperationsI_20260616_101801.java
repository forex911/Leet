// Last updated: 6/16/2026, 10:18:01 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder res=new StringBuilder();
4        for(char x:s.toCharArray()){
5            if(x=='#'){
6                res.append(res);
7            }
8            else if(x=='*'){
9                if(res.length()!=0){
10                    res.deleteCharAt(res.length()-1);
11                }
12            }
13            else if(x=='%'){
14                res.reverse();
15            }
16            else{
17                res.append(x);
18            }
19        }
20        return res.toString();
21    }
22}