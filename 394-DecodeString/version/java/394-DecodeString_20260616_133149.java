// Last updated: 6/16/2026, 1:31:49 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<StringBuilder> stri=new Stack<>();
4        Stack<Integer> inti=new Stack<>();
5        int count=0;
6        StringBuilder s1=new StringBuilder();
7        for(int i=0;i<s.length();i++){
8            char c=s.charAt(i);
9            if(c>='0' && c<='9'){
10                count=10*count+(c-'0');
11            }
12            else if(c=='['){
13                stri.push(s1);
14                inti.push(count);
15                s1=new StringBuilder();
16                count=0;
17            }
18            else if(c==']'){
19                StringBuilder s2=stri.pop();
20                int n=inti.pop();
21                for(int j=0;j<n;j++){
22                    s2.append(s1);
23                }
24                s1=s2;
25            }
26            else{
27                s1.append(c);
28            }
29        }
30        return s1.toString();
31    }
32}