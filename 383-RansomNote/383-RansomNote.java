// Last updated: 5/25/2026, 11:10:08 AM
class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> count=new HashMap<>();
        for(Character s:m.toCharArray()){
            count.put(s,count.getOrDefault(s,0)+1);
        }
        for(Character s:r.toCharArray()){
            if(count.getOrDefault(s,0)==0) return false;
            count.put(s,count.get(s)-1);
        }
        return true;
    }
}