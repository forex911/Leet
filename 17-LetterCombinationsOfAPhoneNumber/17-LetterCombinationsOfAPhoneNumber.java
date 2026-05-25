// Last updated: 5/25/2026, 11:13:28 AM
class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result=new ArrayList<>();
        solve(result,0,"",map,digits);
        return result;
    }
    public static void solve(List<String> result,int st,String current,HashMap<Character,String> map,String digits){        
        
        if(st==digits.length()) {
            result.add(current);
            return;
        }
        String keys=map.get(digits.charAt(st));
        for (int i = 0; i < keys.length(); i++) {
        char c = keys.charAt(i);
        solve(result,st+1,current+c,map,digits);
        }
    }
}