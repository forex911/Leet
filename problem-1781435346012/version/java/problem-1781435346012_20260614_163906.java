// Last updated: 6/14/2026, 4:39:06 PM
1import java.util.*;
2
3class Solution {
4    public long maxRatings(int[][] units) {
5        int m = units.length;
6
7        long baseSum = 0;
8
9        int[] minVal = new int[m];
10        long[] gain = new long[m];
11
12        for (int i = 0; i < m; i++) {
13            int min1 = Integer.MAX_VALUE;
14            int min2 = Integer.MAX_VALUE;
15
16            for (int x : units[i]) {
17                if (x < min1) {
18                    min2 = min1;
19                    min1 = x;
20                } else if (x < min2) {
21                    min2 = x;
22                }
23            }
24
25            minVal[i] = min1;
26            baseSum += min1;
27
28            if (units[i].length == 1) {
29                gain[i] = -min1;
30            } else {
31                gain[i] = (long) min2 - min1;
32            }
33        }
34
35        TreeSet<Integer> set = new TreeSet<>();
36        for (int x : minVal) {
37            set.add(x);
38        }
39
40        List<Integer> vals = new ArrayList<>(set);
41        int k = vals.size();
42
43        Map<Integer, Integer> index = new HashMap<>();
44        for (int i = 0; i < k; i++) {
45            index.put(vals.get(i), i);
46        }
47
48        long[] gainAt = new long[k];
49
50        for (int i = 0; i < m; i++) {
51            gainAt[index.get(minVal[i])] += Math.max(0L, gain[i]);
52        }
53
54        long[] suffix = new long[k];
55        long sum = 0;
56
57        for (int i = k - 1; i >= 0; i--) {
58            sum += gainAt[i];
59            suffix[i] = sum;
60        }
61
62        long[] bestPrefix = new long[k];
63        long best = Long.MIN_VALUE;
64
65        for (int i = 0; i < k; i++) {
66            long value = suffix[i] + vals.get(i);
67            best = Math.max(best, value);
68            bestPrefix[i] = best;
69        }
70
71        long bestImprove = 0;
72
73        for (int i = 0; i < m; i++) {
74            int id = index.get(minVal[i]);
75
76            long improve = bestPrefix[id]
77                    - Math.max(0L, gain[i])
78                    - minVal[i];
79
80            bestImprove = Math.max(bestImprove, improve);
81        }
82
83        return baseSum + bestImprove;
84    }
85}