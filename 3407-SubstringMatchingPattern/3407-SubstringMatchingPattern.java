// Last updated: 9/16/2026, 2:00:17 PM
class Solution {
    public boolean hasMatch(String s, String p) {
        int x=p.indexOf('*');
        String s1=p.substring(0,x);
        String s2=p.substring(x+1);
        if(s.indexOf(s1)==-1){
            return false;
        }
        return s.indexOf(s2,s.indexOf(s1)+s1.length())!=-1;
    }
}