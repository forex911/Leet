// Last updated: 6/21/2026, 9:57:22 AM
1class Solution {
2    public int maxDistance(String moves) {
3        int x=0;
4        int y=0;
5        int count=0;
6        for(int n:moves.toCharArray()){
7            switch(n){
8                case 'L': x--; break;
9                case 'R': x++; break;
10                case 'U': y++; break;
11                case 'D': y--; break;
12                case '_': count++; break;
13            }
14        }
15        return Math.abs(x)+Math.abs(y)+count;
16    }
17}