// Last updated: 8/22/2026, 9:40:21 AM
class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int index=1000;
        int min=1000;
        for(int i=0; i<n; i++){
            int len=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(len<=drones[i][2]){
                if(len<min){
                min=len;
                index=i;
            }
            }
           
        }
        return (min==1000)?-1:index;
        
    }
}