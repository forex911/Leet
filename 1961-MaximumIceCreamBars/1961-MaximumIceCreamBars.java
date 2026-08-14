// Last updated: 8/14/2026, 10:43:35 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=0;
        int ans=0;
        for(int x:costs){
            n+=x;
            if(n>coins){
                n-=x;
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}