// Last updated: 5/25/2026, 11:07:32 AM
class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(slide(s, k, 'T'), slide(s, k, 'F'));
    }

    private int slide(String s, int k, char ch) {
        int l = 0, flips = 0, best = 0;
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) != ch) flips++;
            while (flips > k)
                if (s.charAt(l++) != ch) flips--;
            best = Math.max(best, r - l + 1);
        }
        return best;
    }
}
