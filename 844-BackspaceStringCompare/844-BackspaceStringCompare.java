// Last updated: 9/16/2026, 2:06:13 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=remove(s);
        String s2=remove(t);
        System.out.print(s2);
        if(s1.equals(s2)) return true;
        else return false;
    }
    public String remove(String s){
        StringBuilder sc=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='#'){
                int len=sc.length();
                if(len==0){
                    continue;
                }
                else{
                    sc.deleteCharAt(len-1);
                }
            }
            else{
                sc.append(c);
            }
        }
        return sc.toString();
    }
}