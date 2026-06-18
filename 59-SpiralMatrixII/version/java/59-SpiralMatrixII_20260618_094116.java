// Last updated: 6/18/2026, 9:41:16 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] mat = new int[n][n];
4        int top = 0, left = 0;
5        int bottom = n - 1, right = n - 1;
6        int element = 1;
7        int travel=0;
8        while (travel<n*n) {
9            for (int i = left; i <= right; i++) {
10                mat[top][i] = element++;
11            }
12            top++;
13            for (int i = top; i <= bottom; i++) {
14                mat[i][right] = element++;
15            }
16            right--;
17            for (int i = right; i >= left; i--) {
18                mat[bottom][i] = element++;
19            }
20            bottom--;
21            for (int i = bottom; i >= top; i--) {
22                mat[i][left] = element++;
23            }
24            left++;
25            travel++;
26        }
27        return mat;
28    }
29}
30