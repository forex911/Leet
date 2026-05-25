// Last updated: 5/25/2026, 11:09:40 AM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                count+=i;
            }
        }
        if(count==num){
            return true;
        }
        else{
            return false;
        }
    }
}