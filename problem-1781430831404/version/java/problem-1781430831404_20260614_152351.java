// Last updated: 6/14/2026, 3:23:51 PM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int copy=n;
4        int sum=0;
5        while(copy>0){
6            sum+=copy%10;
7            copy=copy/10;
8        }
9        copy=n;
10        int sq=0;
11        while(copy>0){
12            sq+=(copy%10)*(copy%10);
13            copy=copy/10;
14        }
15        if(sq-sum>=50) return true;
16        else return false;
17    }
18}