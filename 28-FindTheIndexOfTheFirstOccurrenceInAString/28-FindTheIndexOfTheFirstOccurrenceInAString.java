// Last updated: 5/25/2026, 11:13:15 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int len=haystack.length();
        int tar=needle.length();
        for(int i=0;i<=len-tar;i++){
            int j;
            for( j=0;j<tar;j++){
               if (haystack.charAt(i + j) != needle.charAt(j)){
                     break;
               }}
            if (j==tar){
                return i;
            }   
        }
        return -1;
    }
}