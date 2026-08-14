// Last updated: 8/14/2026, 10:41:03 AM
import java.util.*;

class Solution {
    public long maxRatings(int[][] units) {
        int m = units.length;

        long baseSum = 0;

        int[] minVal = new int[m];
        long[] gain = new long[m];

        for (int i = 0; i < m; i++) {
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int x : units[i]) {
                if (x < min1) {
                    min2 = min1;
                    min1 = x;
                } else if (x < min2) {
                    min2 = x;
                }
            }

            minVal[i] = min1;
            baseSum += min1;

            if (units[i].length == 1) {
                gain[i] = -min1;
            } else {
                gain[i] = (long) min2 - min1;
            }
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int x : minVal) {
            set.add(x);
        }

        List<Integer> vals = new ArrayList<>(set);
        int k = vals.size();

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < k; i++) {
            index.put(vals.get(i), i);
        }

        long[] gainAt = new long[k];

        for (int i = 0; i < m; i++) {
            gainAt[index.get(minVal[i])] += Math.max(0L, gain[i]);
        }

        long[] suffix = new long[k];
        long sum = 0;

        for (int i = k - 1; i >= 0; i--) {
            sum += gainAt[i];
            suffix[i] = sum;
        }

        long[] bestPrefix = new long[k];
        long best = Long.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            long value = suffix[i] + vals.get(i);
            best = Math.max(best, value);
            bestPrefix[i] = best;
        }

        long bestImprove = 0;

        for (int i = 0; i < m; i++) {
            int id = index.get(minVal[i]);

            long improve = bestPrefix[id]
                    - Math.max(0L, gain[i])
                    - minVal[i];

            bestImprove = Math.max(bestImprove, improve);
        }

        return baseSum + bestImprove;
    }
}