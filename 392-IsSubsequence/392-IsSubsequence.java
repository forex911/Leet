// Last updated: 5/25/2026, 11:10:04 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i=s.length()-1;
        int j=t.length()-1;
        while(i>=0 && j>=0){
            if(s.charAt(i)==t.charAt(j)){
                i--;
                j--;
            }
            else{
                j--;
            }
        } 
        if(i<0){
            return true;
        }  
        else return false;
         }
}