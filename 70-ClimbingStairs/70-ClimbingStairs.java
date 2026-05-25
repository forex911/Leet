// Last updated: 5/25/2026, 11:12:33 AM
class Solution {
    public int climbStairs(int n) {
        int[] res=new int[n+1];
        res[0]=1;
        res[1]=1;
        if(n<=1){
            return res[n];
        }
        for(int num=2;num<=n;num++){
            res[num]=res[num-1]+res[num-2];
        }
        return res[n];
    }
}