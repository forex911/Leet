// Last updated: 9/16/2026, 1:59:14 PM
class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int ans=0;
        int maxi=Integer.MIN_VALUE;
        for(int j:lights){
            maxi=Math.max(maxi,j);
        }
        for(int i=0;i<arrivalTime.length;i++){
            int x=arrivalTime[i]%period;
            if(x<maxi) continue;
            ans=Math.max(ans,period-x);
        }
        System.out.println(maxi);
        return ans;
    }
}