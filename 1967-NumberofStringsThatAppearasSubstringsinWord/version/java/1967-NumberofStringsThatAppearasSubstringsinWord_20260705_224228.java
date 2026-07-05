// Last updated: 7/5/2026, 10:42:28 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c=0;
4        for(String s:patterns){
5            if(word.contains(s))c++;
6        }
7        return c;
8    }
9}