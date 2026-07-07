// Last updated: 7/7/2026, 6:15:11 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()) return false;
4        HashMap<Character,Integer> store=new HashMap<>();
5        for(char i:s.toCharArray()){
6            store.put(i,store.getOrDefault(i,0)+1);
7        }
8        for(char i:t.toCharArray()){
9            store.put(i,store.getOrDefault(i,0)-1);
10            if(store.get(i)<0) return false;
11        }
12        return true;
13    }
14}