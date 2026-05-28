// Last updated: 5/28/2026, 10:41:03 PM
1class Solution {
2    public boolean validPalindrome(String s) {
3        int left = 0, right = s.length() - 1;
4        while (left < right) {
5            if (s.charAt(left) == s.charAt(right)) {
6                left++;
7                right--;
8            } else {
9                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
10            }
11        }
12        return true;
13    }  
14    private boolean isPalindrome(String s, int left, int right) {
15        while (left < right) {
16            if (s.charAt(left++) != s.charAt(right--)) return false;
17        }
18        return true;
19    }
20}