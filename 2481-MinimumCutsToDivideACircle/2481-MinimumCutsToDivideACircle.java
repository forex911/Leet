// Last updated: 9/16/2026, 2:01:23 PM
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