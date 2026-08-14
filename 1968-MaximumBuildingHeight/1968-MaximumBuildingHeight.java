// Last updated: 8/14/2026, 10:43:33 AM
class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> list = new ArrayList<>();

        list.add(new int[]{1, 0});

        for (int[] r : restrictions) {
            list.add(r);
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < list.size(); i++) {
            int d = list.get(i)[0] - list.get(i - 1)[0];
            list.get(i)[1] = Math.min(list.get(i)[1],list.get(i - 1)[1] + d);
        }


        for (int i = list.size() - 2; i >= 0; i--) {
            int d = list.get(i + 1)[0] - list.get(i)[0];
            list.get(i)[1] = Math.min(list.get(i)[1],list.get(i + 1)[1] + d);
        }

        int ans = 0;

        for (int i = 1; i < list.size(); i++) {
            int x1 = list.get(i - 1)[0];
            int h1 = list.get(i - 1)[1];

            int x2 = list.get(i)[0];
            int h2 = list.get(i)[1];

            int d = x2 - x1;

            ans = Math.max(ans, (h1 + h2 + d) / 2);
        }

        int lastPos = list.get(list.size() - 1)[0];
        int lastH = list.get(list.size() - 1)[1];

        ans = Math.max(ans, lastH + (n - lastPos));

        return ans;
    }
}