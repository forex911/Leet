// Last updated: 5/25/2026, 10:58:43 PM
1class Solution {
2    public int romanToInt(String s) {
3        int res = 0;
4        Map<Character, Integer> roman = new HashMap<>();
5        roman.put('I', 1);
6        roman.put('V', 5);
7        roman.put('X', 10);
8        roman.put('L', 50);
9        roman.put('C', 100);
10        roman.put('D', 500);
11        roman.put('M', 1000);
12
13        for (int i = 0; i < s.length() - 1; i++) {
14            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
15                res -= roman.get(s.charAt(i));
16            } else {
17                res += roman.get(s.charAt(i));
18            }
19        }
20
21        return res + roman.get(s.charAt(s.length() - 1));        
22    }
23}