// Last updated: 9/16/2026, 2:07:23 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> che = new HashMap<>();

        // Count stones
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            che.put(c, che.getOrDefault(c, 0) + 1);
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            count+=che.getOrDefault(c,0);
        }

        return count;
    }
}
