// Last updated: 5/25/2026, 11:12:46 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        for(int[] inter:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<inter[0]){
                res.add(inter);
            }
            else{
                res.get(res.size()-1)[1]=
                    Math.max(res.get(res.size()-1)[1],inter[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}