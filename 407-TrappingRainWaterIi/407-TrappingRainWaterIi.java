// Last updated: 5/25/2026, 11:10:02 AM
import java.util.*;

class Solution {

    class Cell {
        int row, col, height;

        Cell(int r, int c, int h) {
            row = r;
            col = c;
            height = h;
        }
    }

    public int trapRainWater(int[][] heightMap) {

        int m = heightMap.length;
        int n = heightMap[0].length;

        if (m <= 2 || n <= 2) return 0;

        boolean[][] visited = new boolean[m][n];

        PriorityQueue<Cell> pq = new PriorityQueue<>(
                (a, b) -> a.height - b.height
        );

        // Step 1: Add boundary cells
        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        for (int j = 0; j < n; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        int water = 0;

        int[][] dirs = {
            {1,0}, {-1,0}, {0,1}, {0,-1}
        };

        // Step 2: BFS with Min Heap
        while (!pq.isEmpty()) {

            Cell cur = pq.poll();

            for (int[] d : dirs) {

                int nr = cur.row + d[0];
                int nc = cur.col + d[1];

                if (nr < 0 || nc < 0 || nr >= m || nc >= n || visited[nr][nc])
                    continue;

                visited[nr][nc] = true;

                int height = heightMap[nr][nc];

                // Water trapped
                if (height < cur.height) {
                    water += cur.height - height;
                }

                pq.offer(new Cell(
                        nr,
                        nc,
                        Math.max(height, cur.height)
                ));
            }
        }

        return water;
    }
}