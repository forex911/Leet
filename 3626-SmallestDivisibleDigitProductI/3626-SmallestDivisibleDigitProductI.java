// Last updated: 8/14/2026, 10:41:41 AM
class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(checker(i,t)){
                return i;
            }
        }
        return n;
    }
    public static boolean checker(int n,int t){
        int p=1;
        while(n>0){
            p=p*(n%10);
            n=n/10;
        }
        if(p%t==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}