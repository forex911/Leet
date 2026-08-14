// Last updated: 8/14/2026, 10:41:39 AM
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