// Last updated: 5/25/2026, 11:08:20 AM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int q = n / 4;
        int c = 1;
        int p = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == p) {
                c++;
            } else {
                c = 1;
                p = arr[i];
            }

            if (c > q) {
                return arr[i];
            }
        }

        return arr[0];
    }
}