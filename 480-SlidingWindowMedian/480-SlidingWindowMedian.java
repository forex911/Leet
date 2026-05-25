// Last updated: 5/25/2026, 11:09:46 AM
import java.util.*;

class Solution {

    public double[] medianSlidingWindow(int[] nums, int k) {

        TreeMap<Integer, Integer> left = new TreeMap<>();
        TreeMap<Integer, Integer> right = new TreeMap<>();

        int leftSize = 0, rightSize = 0;

        double[] res = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {

            if (leftSize == 0 || nums[i] <= left.lastKey()) {
                left.put(nums[i], left.getOrDefault(nums[i], 0) + 1);
                leftSize++;
            } else {
                right.put(nums[i], right.getOrDefault(nums[i], 0) + 1);
                rightSize++;
            }

            // balance
            while (leftSize > rightSize + 1) {
                int x = left.lastKey();
                remove(left, x);
                leftSize--;

                right.put(x, right.getOrDefault(x, 0) + 1);
                rightSize++;
            }

            while (leftSize < rightSize) {
                int x = right.firstKey();
                remove(right, x);
                rightSize--;

                left.put(x, left.getOrDefault(x, 0) + 1);
                leftSize++;
            }

            // remove outgoing element
            if (i >= k) {
                int out = nums[i - k];

                if (left.containsKey(out)) {
                    remove(left, out);
                    leftSize--;
                } else {
                    remove(right, out);
                    rightSize--;
                }

                // rebalance
                while (leftSize > rightSize + 1) {
                    int x = left.lastKey();
                    remove(left, x);
                    leftSize--;

                    right.put(x, right.getOrDefault(x, 0) + 1);
                    rightSize++;
                }

                while (leftSize < rightSize) {
                    int x = right.firstKey();
                    remove(right, x);
                    rightSize--;

                    left.put(x, left.getOrDefault(x, 0) + 1);
                    leftSize++;
                }
            }

            // compute median
            if (i >= k - 1) {

                if (k % 2 == 1) {
                    res[i - k + 1] = left.lastKey();
                } else {
                    res[i - k + 1] =
                            ((double) left.lastKey() + right.firstKey()) / 2.0;
                }
            }
        }

        return res;
    }

    private void remove(TreeMap<Integer, Integer> map, int x) {
        map.put(x, map.get(x) - 1);
        if (map.get(x) == 0) map.remove(x);
    }
}