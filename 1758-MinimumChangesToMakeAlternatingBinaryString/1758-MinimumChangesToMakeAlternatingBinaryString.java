// Last updated: 9/16/2026, 2:02:53 PM
class Solution {
    public int minOperations(String s) {
        int mis1=0;
        int mis2=0;
        for(int i=0;i<s.length();i++){
            char ex1=(i%2==0)?'0':'1';
            char ex2=(i%2==0)?'1':'0';
            if(s.charAt(i)!=ex1) mis1++;
            if(s.charAt(i)!=ex2) mis2++;
        }
        return Math.min(mis1,mis2);
    }
}