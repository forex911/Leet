// Last updated: 9/16/2026, 2:04:53 PM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] check=new int[26];
        for(char c:chars.toCharArray()){
            check[c-'a']++;
        }
        int res=0;
        for(String s:words){
            boolean dum=true;
            int[] tem=check.clone();
            for(char m:s.toCharArray()){
                tem[m-'a']--;
                if(tem[m-'a']<0){
                    dum=false;
                }
            }
            if(dum==true){
                res+=s.length();
            }
        }
        return res;
    }
}