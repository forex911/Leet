// Last updated: 5/25/2026, 11:11:47 AM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        s=s.toLowerCase();
        int n=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(n--)){
                return false;
            }
        }
        return true;
}
}