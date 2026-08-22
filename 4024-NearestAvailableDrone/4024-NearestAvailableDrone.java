// Last updated: 8/22/2026, 9:39:39 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans=-1;
4        int mini=Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6            int x=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
7            System.out.print(x);
8            if(x<=drones[i][2]){
9                if(x<mini){
10                    ans=i;
11                    mini=Math.min(mini,x);
12                }
13            }
14        }
15        return ans;
16    }
17}