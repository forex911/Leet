// Last updated: 8/14/2026, 10:48:39 AM
class Solution {
    public int longestPalindrome(String s) {
        int[] store=new int[128];
        for(char x:s.toCharArray()){
            store[x]++;
        }
        int res=0;
        boolean odd=false;
        for(int x:store){
            if(x%2==0){
                res+=x;
            }
            else{
                res+=x-1;
                odd=true;
            }
        }
        if(odd) res++;
        return res;
    }
}