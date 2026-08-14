// Last updated: 8/14/2026, 10:42:59 AM
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currentmass = mass;
        for(int i = 0; i < asteroids.length; i++) {
            if(asteroids[i] > currentmass) return false;
            currentmass += asteroids[i];
        }
        return true;
    }
}