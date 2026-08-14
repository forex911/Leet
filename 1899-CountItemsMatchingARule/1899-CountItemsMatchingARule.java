// Last updated: 8/14/2026, 10:43:45 AM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n =0, count =0;
        if(ruleKey.equals("color")){
            n=1;
        }
        if(ruleKey.equals("name")){
            n=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(n).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}