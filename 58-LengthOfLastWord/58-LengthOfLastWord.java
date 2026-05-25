// Last updated: 5/25/2026, 11:12:44 AM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=s.length();
        int count=0;
        for (int i=len-1;i>=0;i--){
            if (s.charAt(i) == ' ') {
                   break;
            }
            else{
                count+=1;
            }
        }
        return count;
    }
}