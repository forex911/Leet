// Last updated: 5/25/2026, 11:13:10 AM
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> res=new Stack<>();
        int max=0;
        res.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                res.push(i);
            }
            else{
                res.pop();
                if(res.isEmpty()){
                    res.push(i);
                }
                else{
                    max=Math.max(max,i-res.peek());
                }
            }
        }
        return max;
    }
}