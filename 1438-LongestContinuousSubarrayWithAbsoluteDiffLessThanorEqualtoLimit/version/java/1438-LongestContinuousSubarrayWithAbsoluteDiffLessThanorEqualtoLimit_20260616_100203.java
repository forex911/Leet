// Last updated: 6/16/2026, 10:02:03 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> store=new Stack<>();
4        for(String s:tokens){
5            if(s.equals("+")){
6                int b=store.pop();
7                int a=store.pop();
8                store.push(a+b);
9            }
10            else if(s.equals("-")){
11                int b=store.pop();
12                int a=store.pop();
13                store.push(a-b);
14            }
15            else if(s.equals("/")){
16                int b=store.pop();
17                int a=store.pop();
18                store.push(a/b);
19            }
20            else if(s.equals("*")){
21                int b=store.pop();
22                int a=store.pop();
23                store.push(a*b);
24            }
25            else{
26                store.push(Integer.parseInt(s));
27            }
28        }
29        return store.peek();
30    }
31}