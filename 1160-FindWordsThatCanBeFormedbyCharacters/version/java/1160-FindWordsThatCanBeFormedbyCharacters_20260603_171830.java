// Last updated: 6/3/2026, 5:18:30 PM
1class Solution {
2    public int countCharacters(String[] words, String chars) {
3        int[] check=new int[26];
4        for(char c:chars.toCharArray()){
5            check[c-'a']++;
6        }
7        int res=0;
8        for(String s:words){
9            boolean dum=true;
10            int[] tem=check.clone();
11            for(char m:s.toCharArray()){
12                tem[m-'a']--;
13                if(tem[m-'a']<0){
14                    dum=false;
15                }
16            }
17            if(dum==true){
18                res+=s.length();
19            }
20        }
21        return res;
22    }
23}