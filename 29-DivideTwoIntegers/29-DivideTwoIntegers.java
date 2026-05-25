// Last updated: 5/25/2026, 11:13:14 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        else{
            return dividend/divisor;
        }
    }
}