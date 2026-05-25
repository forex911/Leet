// Last updated: 5/25/2026, 11:08:53 AM
class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int[] count = new int[2001];
        int n = fronts.length;
        for (int i = 0; i < n; i++) {
            if (fronts[i] == backs[i]) {
                count[fronts[i]]++;
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (count[fronts[i]] == 0) {
                res = Math.min(res, fronts[i]);
            }
            if (count[backs[i]] == 0) {
                res = Math.min(res, backs[i]);
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}