// Last updated: 8/14/2026, 10:40:50 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int copy=n;
        int sum=0;
        while(copy>0){
            sum+=copy%10;
            copy=copy/10;
        }
        copy=n;
        int sq=0;
        while(copy>0){
            sq+=(copy%10)*(copy%10);
            copy=copy/10;
        }
        if(sq-sum>=50) return true;
        else return false;
    }
}