// Last updated: 9/16/2026, 2:03:52 PM
class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0,n=c.length;
        for(int i=0;i<k;i++){
            sum+=c[i];
        }
        int max=sum;
        for(int i=0;i<k;i++){
            sum+=c[n-i-1]-c[k-i-1];
            if(sum>max){
                max=sum;            }
        }
        return max;
    }
}