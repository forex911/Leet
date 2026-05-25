// Last updated: 5/25/2026, 11:07:10 AM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if(p==100){
            return 0;
        }
        int r=0;
        if(p<10){
            if(p>4){
                r=10;
            }
            return 100-r;
        }
        else{
            int re=p%10;
            System.out.print(re);
            if(re>4){
                re=10-re;
                p+=re;
            }
            else{
                p-=re;
            }
            
            return 100-p;
        }
        
}
}