// Last updated: 6/3/2026, 10:45:32 AM
1class Solution {
2    public int[][] intervalIntersection(int[][] a, int[][] b) {
3        List<int[]>store =new ArrayList<>();
4        int j=0;
5        int i=0;
6        while(i<a.length &&j<b.length){
7            int start=Math.max(a[i][0],b[j][0]);
8            int end=Math.min(a[i][1],b[j][1]);
9            if(start<=end){
10                store.add(new int[] {start,end});
11            }
12            if(a[i][1]<b[j][1]){
13                i++;
14            }
15            else{
16                j++;
17            }
18        }
19         return store.toArray(new int[store.size()][]);
20    }
21}