// Last updated: 5/25/2026, 11:07:33 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        String rev="";
        int num=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                num=i;  
                break;
            }}

            for (int j=num;j>=0;j--){
                    rev+=word.charAt(j);
                }
            for(int j=num+1;j<word.length();j++){
                rev+=word.charAt(j);
            }
        
       
            return rev;
        
    }
}