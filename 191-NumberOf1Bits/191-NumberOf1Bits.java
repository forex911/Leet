// Last updated: 5/25/2026, 11:11:12 AM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            n= n&(n-1);
            count++;
        }
        return count;
    }
}