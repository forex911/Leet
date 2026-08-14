// Last updated: 8/14/2026, 10:40:46 AM
class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int count=0;
        for(int n:moves.toCharArray()){
            switch(n){
                case 'L': x--; break;
                case 'R': x++; break;
                case 'U': y++; break;
                case 'D': y--; break;
                case '_': count++; break;
            }
        }
        return Math.abs(x)+Math.abs(y)+count;
    }
}