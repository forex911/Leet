// Last updated: 5/31/2026, 8:43:42 PM
1class Solution {
2    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
3        Arrays.sort(asteroids);
4        long currentmass = mass;
5        for(int i = 0; i < asteroids.length; i++) {
6            if(asteroids[i] > currentmass) return false;
7            currentmass += asteroids[i];
8        }
9        return true;
10    }
11}