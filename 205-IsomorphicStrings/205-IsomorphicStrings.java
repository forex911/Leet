// Last updated: 5/25/2026, 11:11:02 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(h.containsKey(c1) && h.get(c1)!=c2){
                return false;
            }
            if(!h.containsKey(c1) && h.containsValue(c2)){
                return false;
            }
            h.put(c1,c2);
        }
        return true;
    }
}