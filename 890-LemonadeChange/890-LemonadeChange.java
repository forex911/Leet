// Last updated: 5/25/2026, 11:08:47 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum=0;
        int f=0;
        int t=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                f++;
            }
            else{
                int num=bills[i]-5;
                if(num==5 && f>=1){
                    f--;
                }
                else if(num==10 && t>=1){
                    t--;
                }
                else if(num==15 && f>=1 && t>=1){
                    f--;
                    t--;
                }
                else if(num==15 && f>=3){
                    f-=3;
                }
                else{
                    return false;
                }
                if(bills[i]==10){
                    t++;
                }
            }
        }
        
        return true;
    }
}