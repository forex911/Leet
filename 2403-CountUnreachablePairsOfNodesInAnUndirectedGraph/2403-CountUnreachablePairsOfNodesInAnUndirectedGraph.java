// Last updated: 5/25/2026, 11:07:26 AM
class Solution {
    public long countPairs(int n, int[][] edges) {

        // build graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        long result = 0;
        long remaining = n;

        // find connected components
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long size = dfs(i, graph, visited);
                result += size * (remaining - size);
                remaining -= size;
            }
        }

        return result;
    }

    private long dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        long count = 1;

        for (int nei : graph.get(node)) {
            if (!visited[nei]) {
                count += dfs(nei, graph, visited);
            }
        }
        return count;
    }
}
