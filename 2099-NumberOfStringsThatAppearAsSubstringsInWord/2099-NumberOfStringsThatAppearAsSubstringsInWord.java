// Last updated: 8/14/2026, 10:43:14 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(s))c++;
        }
        return c;
    }
}