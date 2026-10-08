// Last updated: 10/8/2026, 3:12:14 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        Stack<Integer> store = new Stack<>();
4        String si = "";
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == '(') {
7                if (!store.isEmpty()) {
8                    si += "(";
9                }
10                store.push(1);
11            } 
12            else {
13                store.pop();
14
15                if (!store.isEmpty()) {
16                    si += ")";
17                }
18            }
19        }
20        return si;
21    }
22}