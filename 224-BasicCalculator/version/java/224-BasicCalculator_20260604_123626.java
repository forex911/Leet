// Last updated: 6/4/2026, 12:36:26 PM
1class Solution {
2    public String decodeMessage(String key, String message) {
3        HashMap<Character,Character> solve=new HashMap<>();
4        char curr='a';
5        for(char c:key.toCharArray()){
6            if(c==(' ')) continue;
7            if(!solve.containsKey(c)){
8                solve.put(c,curr++);
9            }
10        }
11        StringBuilder res=new StringBuilder();
12        for(char c:message.toCharArray()){
13            if(c==(' ')) res.append(' ');
14            else{ res.append(solve.get(c)); }
15        }
16        return res.toString();
17    }
18}