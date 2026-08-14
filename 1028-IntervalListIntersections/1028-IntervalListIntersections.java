// Last updated: 8/14/2026, 10:45:40 AM
class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        List<int[]>store =new ArrayList<>();
        int j=0;
        int i=0;
        while(i<a.length &&j<b.length){
            int start=Math.max(a[i][0],b[j][0]);
            int end=Math.min(a[i][1],b[j][1]);
            if(start<=end){
                store.add(new int[] {start,end});
            }
            if(a[i][1]<b[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
         return store.toArray(new int[store.size()][]);
    }
}