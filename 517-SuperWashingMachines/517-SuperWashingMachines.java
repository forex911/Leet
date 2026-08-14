// Last updated: 8/14/2026, 10:47:52 AM
class Solution {
    public int findMinMoves(int[] machines) {
        int sum=0;
        for(int n:machines){
            sum+=n;
        }
        if(sum%machines.length!=0){
            return -1;
        }
        int x=sum/machines.length,bal=0,count=0;
        for(int n:machines){
            int dif=n-x;
            bal+=dif;
            count=Math.max(count,Math.max(dif,Math.abs(bal)));
        }
        return count;
    }
}