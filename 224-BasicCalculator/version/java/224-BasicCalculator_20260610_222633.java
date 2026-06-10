// Last updated: 6/10/2026, 10:26:33 PM
1class Solution {
2    public int calculate(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        int res = 0;
7        int curr = 0;
8        int sign = 1;
9
10        for (char c : s.toCharArray()) {
11
12            if (Character.isDigit(c)) {
13                curr = curr * 10 + (c - '0');
14            } 
15            else if (c == '+') {
16                res += curr * sign;
17                sign = 1;
18                curr = 0;
19            } 
20            else if (c == '-') {
21                res += curr * sign;
22                sign = -1;
23                curr = 0;
24            } 
25            else if (c == '(') {
26                stack.push(res);
27                stack.push(sign);
28                res = 0;
29                sign = 1;
30                curr = 0;
31            } 
32            else if (c == ')') {
33                res += curr * sign;
34                curr = 0;
35                res *= stack.pop();
36                res += stack.pop();
37            }
38        }
39
40        res += sign * curr;
41        return res;
42    }
43}