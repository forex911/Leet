// Last updated: 7/13/2026, 9:57:25 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int[] sorted = Arrays.copyOf(arr, arr.length);
4        Arrays.sort(sorted);
5        Map<Integer, Integer> ranked = new HashMap<>();
6        int rank = 1;
7        for (int num : sorted) {
8            if (!ranked.containsKey(num)) {
9                ranked.put(num, rank++);
10            }
11        }
12        int[] result = new int[arr.length];
13        for (int i = 0; i < arr.length; i++) {
14            result[i] = ranked.get(arr[i]);
15        }
16        return result;
17    }
18}   