// Last updated: 5/25/2026, 11:09:02 AM
class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        dfs(0, graph, path);
        return result;
    }

    private void dfs(int node, int[][] graph, List<Integer> path) {
        path.add(node);

        if (node == graph.length - 1) {
            result.add(new ArrayList<>(path));
        } else {
            for (int next : graph[node]) {
                dfs(next, graph, path);
            }
        }

        path.remove(path.size() - 1);
    }
}
