// Last updated: 6/10/2026, 10:34:51 PM
1class Solution {
2    public int calculate(String s) {
3        int res = 0, n = 0;
4        Stack<Integer> st = new Stack<>();
5        s += '+';
6        char op = '+';
7        for(int i = 0; i < s.length(); i++){
8            char c = s.charAt(i);
9
10            if(c == ' ') continue;
11
12            if(Character.isDigit(c)){
13                n = n * 10 + (c - '0');
14                continue;
15            }
16
17            if(op == '+') st.push(n);
18            else if(op == '-') st.push(-n);
19            else if(op == '*') st.push(st.pop() * n);
20            else if(op == '/') st.push(st.pop() / n);
21
22            op = c;
23            n = 0;
24        }
25
26        for(int i : st){
27            res += i;
28        }
29
30        return res;
31    }
32}