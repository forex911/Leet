// Last updated: 5/25/2026, 11:08:22 AM

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n + 1];
        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];
            int val = bookings[i][2];
            diff[start] += val;
            if (end + 1 <= n) {
                diff[end + 1] -= val;
            }
        }
        int[] res = new int[n];
        res[0] = diff[1];
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + diff[i + 1];
        }
        return res;
    }
}