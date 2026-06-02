// Last updated: 6/2/2026, 6:16:05 AM
1import java.util.*;
2
3class Solution {
4    public int[][] insert(int[][] intervals, int[] newInterval) {
5        List<int[]> result = new ArrayList<>();
6        int i = 0;
7        int n = intervals.length;
8        while (i < n && intervals[i][1] < newInterval[0]) {
9            result.add(intervals[i]);
10            i++;
11        }
12        while (i < n && intervals[i][0] <= newInterval[1]) {
13            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
14            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
15            i++;
16        }
17        result.add(newInterval);
18        while (i < n) {
19            result.add(intervals[i]);
20            i++;
21        }
22        return result.toArray(new int[result.size()][]);
23    }
24}