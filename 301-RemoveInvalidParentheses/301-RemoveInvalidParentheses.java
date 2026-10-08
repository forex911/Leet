// Last updated: 10/8/2026, 3:11:20 PM
1class Solution {
2    public List<String> removeInvalidParentheses(String s) {
3        List<String> ans = new ArrayList<>();
4        int left = 0;
5        int right = 0;
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                left++;
9            } 
10            else if (ch == ')') {
11                if (left > 0) {
12                    left--;
13                } 
14                else {
15                    right++;
16                }
17            }
18        }
19        backtrack(s, 0, left, right, 0,new StringBuilder(), ans);
20        return ans;
21    }
22    public void backtrack(String s,int ind,int leftRemove,int rightRemove,int balance,StringBuilder cur,List<String> ans) {
23        if (balance < 0) {
24            return;
25        }
26        if (ind == s.length()) {
27            if (leftRemove == 0 && rightRemove == 0 && balance == 0) {
28                if(!ans.contains(cur.toString()))
29                ans.add(cur.toString());
30            }
31            return;
32        }
33        char ch = s.charAt(ind);
34        if (ch == '(' && leftRemove > 0) {
35            backtrack(s,ind + 1,leftRemove - 1,rightRemove,balance,cur,ans);
36        }
37        if (ch == ')' && rightRemove > 0) {
38            backtrack(s,ind + 1,leftRemove,rightRemove - 1,balance,cur,ans);
39        }
40        cur.append(ch);
41        if (ch == '(') {
42            backtrack(s,ind + 1,leftRemove,rightRemove,balance + 1,cur,ans);
43        } else if (ch == ')') {
44            backtrack(s,ind + 1,leftRemove,rightRemove,balance - 1,cur,ans);
45        }
46        else {
47            backtrack(s,ind + 1,leftRemove,rightRemove,balance,cur,ans);
48        }
49        cur.deleteCharAt(cur.length() - 1);
50    }
51}