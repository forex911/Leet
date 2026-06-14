// Last updated: 6/14/2026, 3:45:58 PM
1import java.util.*;
2
3class Solution {
4    public int getLength(int[] nums) {
5        int n = nums.length;
6        int ans = 1;
7
8        for (int i = 0; i < n; i++) {
9            Map<Integer, Integer> freq = new HashMap<>();
10            Map<Integer, Integer> freqCount = new HashMap<>();
11
12            for (int j = i; j < n; j++) {
13                int x = nums[j];
14
15                int oldFreq = freq.getOrDefault(x, 0);
16
17                if (oldFreq > 0) {
18                    freqCount.put(oldFreq, freqCount.get(oldFreq) - 1);
19                    if (freqCount.get(oldFreq) == 0) {
20                        freqCount.remove(oldFreq);
21                    }
22                }
23
24                int newFreq = oldFreq + 1;
25                freq.put(x, newFreq);
26                freqCount.put(newFreq,
27                        freqCount.getOrDefault(newFreq, 0) + 1);
28
29                if (isValid(freq, freqCount)) {
30                    ans = Math.max(ans, j - i + 1);
31                }
32            }
33        }
34
35        return ans;
36    }
37
38    private boolean isValid(Map<Integer, Integer> freq,
39                            Map<Integer, Integer> freqCount) {
40
41        // Only one distinct value
42        if (freq.size() == 1) {
43            return true;
44        }
45
46        // Need exactly two frequencies
47        if (freqCount.size() != 2) {
48            return false;
49        }
50
51        Iterator<Integer> it = freqCount.keySet().iterator();
52
53        int a = it.next();
54        int b = it.next();
55
56        int f1 = Math.min(a, b);
57        int f2 = Math.max(a, b);
58
59        // Frequencies must be f and 2f
60        return f2 == 2 * f1;
61    }
62}