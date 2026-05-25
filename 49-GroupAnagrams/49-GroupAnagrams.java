// Last updated: 5/25/2026, 11:12:55 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> check=new HashMap<>();
        for(String s:strs){
            char[] sep=s.toCharArray();
            Arrays.sort(sep);
            String key=new String(sep);
            if(!check.containsKey(key)){
                check.put(key,new ArrayList<>());
            }
            check.get(key).add(s);
        }
        return new ArrayList<>(check.values());
    }
}