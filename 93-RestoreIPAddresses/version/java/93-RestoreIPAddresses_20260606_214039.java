// Last updated: 6/6/2026, 9:40:39 PM
1class Solution {
2    List<String> ans = new ArrayList<>();
3    String str;
4    public List<String> restoreIpAddresses(String s) {
5        str = s;
6        magical("", 0, 0);
7        return ans;
8    } 
9
10    void magical( String path, int index, int dots) {
11        if (dots > 4) return;
12        if (dots == 4 && index >= str.length()) {
13            ans.add(path.substring(0,path.length()-1));
14            return;
15        }
16        for (int length = 1; length <= 3 && index + length <= str.length(); length++) {
17            String num = str.substring(index, index + length);
18            if (num.charAt(0) == '0' && length != 1) break;
19            else if (Integer.parseInt(num) <= 255) {
20                magical( path + str.substring(index, index + length) + ".", index + length,dots + 1);
21            }
22        }
23    }
24}