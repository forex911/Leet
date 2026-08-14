// Last updated: 8/14/2026, 10:48:28 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < prevEnd) {
                count++; 
            } else {
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}