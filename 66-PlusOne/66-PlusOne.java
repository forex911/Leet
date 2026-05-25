// Last updated: 5/25/2026, 11:12:37 AM
class Solution {
    public int[] plusOne(int[] digits) {
       
        for (int i = digits.length - 1; i >= 0; i--) {
       if (digits[i] < 9) {
                digits[i]++;
                return digits; 
            }
            digits[i] = 0;
        }
        
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; 
        return newNumber; 
    }
}