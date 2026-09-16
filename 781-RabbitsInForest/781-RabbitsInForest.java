// Last updated: 9/16/2026, 2:07:02 PM
class Solution {
    public int numRabbits(int[] answers) {
        int n = answers.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int all = 0;
        for(int val : answers){
            int total = val + 1;
            if(map.containsKey(total)){
                if(map.get(total) != total) map.put(total,map.get(total)+1);
                else {
                    all += total;
                    map.put(total,1);
                }
            } else map.put(total,1);
        }

        for(int count : map.keySet()) all += count;
        return all;
    }
}