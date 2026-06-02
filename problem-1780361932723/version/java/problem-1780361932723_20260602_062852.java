// Last updated: 6/2/2026, 6:28:52 AM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3
4        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
5
6        int count = 0;
7        int prevEnd = intervals[0][1];
8
9        for (int i = 1; i < intervals.length; i++) {
10
11            if (intervals[i][0] < prevEnd) {
12                count++; 
13            } else {
14                prevEnd = intervals[i][1];
15            }
16        }
17
18        return count;
19    }
20}