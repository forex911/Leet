// Last updated: 6/27/2026, 5:38:49 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        HashMap<Character, String> map = new HashMap<>();
4        map.put('2', "abc");
5        map.put('3', "def");
6        map.put('4', "ghi");
7        map.put('5', "jkl");
8        map.put('6', "mno");
9        map.put('7', "pqrs");
10        map.put('8', "tuv");
11        map.put('9', "wxyz");
12        List<String> result=new ArrayList<>();
13        solve(result,0,"",map,digits);
14        return result;
15    }
16    public static void solve(List<String> result,int st,String current,HashMap<Character,String> map,String digits){        
17        
18        if(st==digits.length()) {
19            result.add(current);
20            return;
21        }
22        String keys=map.get(digits.charAt(st));
23        for (int i = 0; i < keys.length(); i++) {
24        char c = keys.charAt(i);
25        solve(result,st+1,current+c,map,digits);
26        }
27    }
28}