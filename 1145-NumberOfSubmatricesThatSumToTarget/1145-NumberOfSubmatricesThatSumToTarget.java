// Last updated: 5/29/2026, 9:19:48 AM
class Solution {

    public int numSubmatrixSumTarget(
            int[][] matrix,
            int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int count = 0;

        for (int top = 0; top < rows; top++) {

            int[] colSum = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                for (int c = 0; c < cols; c++) {

                    colSum[c] += matrix[bottom][c];
                }

                HashMap<Integer, Integer> map = new HashMap<>();

                map.put(0, 1);

                int prefix = 0;

                for (int val : colSum) {

                    prefix += val;

                    count += map.getOrDefault(
                            prefix - target,
                            0);

                    map.put(
                            prefix,
                            map.getOrDefault(
                                    prefix,
                                    0) + 1);
                }
            }
        }

        return count;
    }
}