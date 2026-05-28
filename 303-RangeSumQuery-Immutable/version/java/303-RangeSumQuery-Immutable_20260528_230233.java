// Last updated: 5/28/2026, 11:02:33 PM
1class Solution {
2
3    public int numSubmatrixSumTarget(
4            int[][] matrix,
5            int target) {
6
7        int rows = matrix.length;
8        int cols = matrix[0].length;
9
10        int count = 0;
11
12        for (int top = 0; top < rows; top++) {
13
14            int[] colSum = new int[cols];
15
16            for (int bottom = top; bottom < rows; bottom++) {
17
18                for (int c = 0; c < cols; c++) {
19
20                    colSum[c] += matrix[bottom][c];
21                }
22
23                HashMap<Integer, Integer> map = new HashMap<>();
24
25                map.put(0, 1);
26
27                int prefix = 0;
28
29                for (int val : colSum) {
30
31                    prefix += val;
32
33                    count += map.getOrDefault(
34                            prefix - target,
35                            0);
36
37                    map.put(
38                            prefix,
39                            map.getOrDefault(
40                                    prefix,
41                                    0) + 1);
42                }
43            }
44        }
45
46        return count;
47    }
48}