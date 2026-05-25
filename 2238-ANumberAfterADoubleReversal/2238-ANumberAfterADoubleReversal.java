// Last updated: 5/25/2026, 11:07:28 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        else{
           if(num%10==0){
            return false;
           }
           else{
            return true;
           }
        }
    }
}