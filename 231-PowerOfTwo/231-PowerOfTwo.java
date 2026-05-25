// Last updated: 5/25/2026, 11:10:48 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        if(n%2!=0) return false;
        return isPowerOfTwo(n/2);    
    }
}