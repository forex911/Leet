// Last updated: 8/14/2026, 10:51:10 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> store=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int b=store.pop();
                int a=store.pop();
                store.push(a+b);
            }
            else if(s.equals("-")){
                int b=store.pop();
                int a=store.pop();
                store.push(a-b);
            }
            else if(s.equals("/")){
                int b=store.pop();
                int a=store.pop();
                store.push(a/b);
            }
            else if(s.equals("*")){
                int b=store.pop();
                int a=store.pop();
                store.push(a*b);
            }
            else{
                store.push(Integer.parseInt(s));
            }
        }
        return store.peek();
    }
}