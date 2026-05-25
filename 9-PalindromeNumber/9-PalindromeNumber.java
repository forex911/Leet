// Last updated: 5/25/2026, 11:13:37 AM
class Solution {
    public static boolean rev(int num) {
        if (num < 0) return false;
        int original = num, reversed = 0;
        while (num > 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }
        return original == reversed;
    }
    public boolean isPalindrome(int x) {
        return rev(x);
    }
}
