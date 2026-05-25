// Last updated: 5/25/2026, 11:07:20 AM
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0){
            int cut=n/2;
            return cut;
        }
        else if(n==1){
            return 0;
        }
        else{
            return n;
        }
    }
}