// Last updated: 8/14/2026, 10:48:44 AM
class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stri=new Stack<>();
        Stack<Integer> inti=new Stack<>();
        int count=0;
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                count=10*count+(c-'0');
            }
            else if(c=='['){
                stri.push(s1);
                inti.push(count);
                s1=new StringBuilder();
                count=0;
            }
            else if(c==']'){
                StringBuilder s2=stri.pop();
                int n=inti.pop();
                for(int j=0;j<n;j++){
                    s2.append(s1);
                }
                s1=s2;
            }
            else{
                s1.append(c);
            }
        }
        return s1.toString();
    }
}