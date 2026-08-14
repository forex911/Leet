// Last updated: 8/14/2026, 10:42:44 AM
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> solve=new HashMap<>();
        char curr='a';
        for(char c:key.toCharArray()){
            if(c==(' ')) continue;
            if(!solve.containsKey(c)){
                solve.put(c,curr++);
            }
        }
        StringBuilder res=new StringBuilder();
        for(char c:message.toCharArray()){
            if(c==(' ')) res.append(' ');
            else{ res.append(solve.get(c)); }
        }
        return res.toString();
    }
}