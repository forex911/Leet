// Last updated: 5/25/2026, 11:09:05 AM
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