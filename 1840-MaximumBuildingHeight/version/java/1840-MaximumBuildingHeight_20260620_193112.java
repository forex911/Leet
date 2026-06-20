// Last updated: 6/20/2026, 7:31:12 PM
1class Solution {
2    public int maxBuilding(int n, int[][] restrictions) {
3        List<int[]> list = new ArrayList<>();
4
5        list.add(new int[]{1, 0});
6
7        for (int[] r : restrictions) {
8            list.add(r);
9        }
10
11        Collections.sort(list, (a, b) -> a[0] - b[0]);
12
13        for (int i = 1; i < list.size(); i++) {
14            int d = list.get(i)[0] - list.get(i - 1)[0];
15            list.get(i)[1] = Math.min(list.get(i)[1],list.get(i - 1)[1] + d);
16        }
17
18
19        for (int i = list.size() - 2; i >= 0; i--) {
20            int d = list.get(i + 1)[0] - list.get(i)[0];
21            list.get(i)[1] = Math.min(list.get(i)[1],list.get(i + 1)[1] + d);
22        }
23
24        int ans = 0;
25
26        for (int i = 1; i < list.size(); i++) {
27            int x1 = list.get(i - 1)[0];
28            int h1 = list.get(i - 1)[1];
29
30            int x2 = list.get(i)[0];
31            int h2 = list.get(i)[1];
32
33            int d = x2 - x1;
34
35            ans = Math.max(ans, (h1 + h2 + d) / 2);
36        }
37
38        int lastPos = list.get(list.size() - 1)[0];
39        int lastH = list.get(list.size() - 1)[1];
40
41        ans = Math.max(ans, lastH + (n - lastPos));
42
43        return ans;
44    }
45}