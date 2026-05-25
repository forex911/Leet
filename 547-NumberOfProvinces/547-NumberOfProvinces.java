// Last updated: 5/25/2026, 11:09:33 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
       
        int n = isConnected.length;

        boolean[] visited = new boolean[n];

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                count++;
            }
        }

        return count;
    }

    public void dfs(int node, int[][] grid, boolean[] visited) {
        if (visited[node]) return;

        visited[node] = true;

        for (int i = 0; i < grid.length; i++) {
            if (grid[node][i] == 1) {
                if (!visited[i]) {
                    dfs(i, grid, visited);
                }
            }
        }
    }
}