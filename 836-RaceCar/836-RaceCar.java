// Last updated: 5/25/2026, 11:08:55 AM
class Solution {
    public int racecar(int target) {
        Queue<long[]> que = new LinkedList<>(); //int[] -> {pos,speed}
        // Set<String> set = new HashSet<>();
        que.add(new long[] { 0, 1 });
        int steps = 0;
        while (!que.isEmpty()) {
            int size = que.size();
            for (int i = 0; i < size; i++) {
                long[] curr = que.poll();
                if ((int) curr[0] == target)
                    return steps;
                long[] acc = new long[] { curr[0] + curr[1], curr[1] * 2 };
                long[] rev = new long[] { curr[0], curr[1] > 0 ? -1 : 1 };
                if (curr[0] + curr[1] < 2*target)
                    que.add(acc);
                if ((curr[1]>0 && curr[0]+curr[1]>target) ||(curr[1]<0 && curr[0] +curr[1] <target))
                    que.add(rev);
            }
            steps++;
        }
        return -1;
    }
}