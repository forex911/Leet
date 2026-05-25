// Last updated: 5/25/2026, 11:08:45 AM
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int fuel=startFuel;
        int i=0;
        int stops=0;
        int n=stations.length;
        while(fuel<target){
            while(i<n && stations[i][0]<=fuel){
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            fuel+=pq.poll();
            stops++;
        }
        return stops;
    }
}