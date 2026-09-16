// Last updated: 9/16/2026, 2:02:38 PM
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