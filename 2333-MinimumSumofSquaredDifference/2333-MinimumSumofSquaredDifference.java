// Last updated: 10/10/2026, 10:01:52 AM
1class Solution {
2    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
3        int n = nums1.length;
4        int[] diff = new int[n];
5        long k = (long) k1 + k2;
6        long total = 0;
7        int maxDiff = 0;
8
9        for (int i = 0; i < n; i++) {
10            diff[i] = Math.abs(nums1[i] - nums2[i]);
11            total += diff[i];
12            maxDiff = Math.max(maxDiff, diff[i]);
13        }
14
15        if (total <= k) {
16            return 0;
17        }
18
19        int left = 0, right = maxDiff;
20        while (left < right) {
21            int mid = left + (right - left) / 2;
22            long operations = 0;
23            
24            for (int d : diff) {
25                if (d > mid) {
26                    operations += d - mid;
27                }
28            }
29            
30            if (operations <= k) {
31                right = mid;
32            } else {
33                left = mid + 1;
34            }
35        }
36
37        int threshold = left;
38        long remaining = k;
39        
40        for (int d : diff) {
41            if (d > threshold) {
42                remaining -= d - threshold;
43            }
44        }
45
46        long result = 0;
47        for (int d : diff) {
48            d = Math.min(d, threshold);
49            
50            if (d == threshold && remaining > 0) {
51                d--;
52                remaining--;
53            }
54            
55            result += (long) d * d;
56        }
57
58        return result;
59    }
60}