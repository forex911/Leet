// Last updated: 6/3/2026, 5:49:26 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack=new Stack<>();
4        for(String toc:tokens){
5            if(toc.equals("+")){
6                int b=stack.pop();
7                int a=stack.pop();
8                stack.push(a+b);
9            }
10            else if(toc.equals("*")){
11                int b=stack.pop();
12                int a=stack.pop();
13                stack.push(a*b);
14            }
15            else if(toc.equals("/")){
16                int b=stack.pop();
17                int a=stack.pop();
18                stack.push(a/b);
19            }
20            else if(toc.equals("-")){
21                int b=stack.pop();
22                int a=stack.pop();
23                stack.push(a-b);
24            }
25            else{
26                stack.push(Integer.parseInt(toc));
27            }
28        }
29        return stack.pop();
30    }
31}