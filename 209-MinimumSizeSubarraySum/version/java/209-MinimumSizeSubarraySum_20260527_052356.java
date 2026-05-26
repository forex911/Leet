// Last updated: 5/27/2026, 5:23:56 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        if(s.length()==0) return 0;
4        int result=Integer.MIN_VALUE;
5        int left=0;
6        Set tem=new HashSet<>();
7        
8        for(int right=0;right<s.length();right++){
9            while(tem.contains(s.charAt(right))){
10                tem.remove(s.charAt(left));
11                left++;
12            }
13            tem.add(s.charAt(right));
14            result=Math.max(result,right-left+1);
15        }
16        if(result==Integer.MAX_VALUE) return 0;
17        return result;
18    }
19}