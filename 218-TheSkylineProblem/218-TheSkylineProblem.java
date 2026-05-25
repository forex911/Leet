// Last updated: 5/25/2026, 11:10:54 AM
import java.util.*;

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        
        List<int[]> events = new ArrayList<>();
        
        // Step 1: create events
        for(int[] b : buildings){
            events.add(new int[]{b[0], -b[2]}); // start
            events.add(new int[]{b[1], b[2]});  // end
        }
        
        // Step 2: sort events
        Collections.sort(events, (a,b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });
        
        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(0);
        
        int prevMax = 0;
        List<List<Integer>> result = new ArrayList<>();
        
        for(int[] e : events){
            
            int x = e[0];
            int h = e[1];
            
            if(h < 0){
                pq.add(-h);     // start event
            }else{
                pq.remove(h);   // end event
            }
            
            int currMax = pq.peek();
            
            if(currMax != prevMax){
                result.add(Arrays.asList(x, currMax));
                prevMax = currMax;
            }
        }
        
        return result;
    }
}