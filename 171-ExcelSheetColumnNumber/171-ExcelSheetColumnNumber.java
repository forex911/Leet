// Last updated: 5/25/2026, 11:11:20 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int result =0;
        for(char c:columnTitle.toCharArray()){
            result =result*26+(c-'A'+1);




        }
 
    return result;
    }
}