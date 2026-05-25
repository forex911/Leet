// Last updated: 5/25/2026, 11:12:14 AM
import java.util.HashMap;
import java.util.Map;

class Solution {
    // Map to store results of subproblems: "s1+s2" -> Boolean
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();
        
        // 1. Base Case: If strings are identical
        if (s1.equals(s2)) return true;
        
        // 2. Check Memoization
        String key = s1 + " " + s2;
        if (memo.containsKey(key)) return memo.get(key);
        
        // 3. Pruning: If they aren't anagrams, they can't be scrambles
        if (!isAnagram(s1, s2)) {
            memo.put(key, false);
            return false;
        }

        // 4. Recursive Splitting
        for (int i = 1; i < n; i++) {
            // Case 1: No Swap
            // Split s1 into [0,i] and [i,n], compare with s2 split at same index
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && 
                isScramble(s1.substring(i), s2.substring(i))) {
                memo.put(key, true);
                return true;
            }

            // Case 2: Swap
            // Split s1 into [0,i] and [i,n], compare with s2's mirrored parts
            if (isScramble(s1.substring(0, i), s2.substring(n - i)) && 
                isScramble(s1.substring(i), s2.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}