// Last updated: 5/25/2026, 11:10:14 AM
class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
           char temp=s[i];
           s[i]=s[(s.length-i)-1];
           s[(s.length-i)-1]=temp;
        }
        
    }
}